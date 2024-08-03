package com.java.laboratory.practices.structures.dataTypes.nonLinear.GraphExample;

import java.util.*;

public class DeliveryArea {
    public int[][] matrix;

    public DeliveryArea(int[][] matrix) {
        this.matrix = matrix;
    }

    public Map<String, List<Cell>> buildGraph() {
        Map<String, List<Cell>> graph = new HashMap<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] != 0) { // accessible
                    Cell currentCell = new Cell(row, col);
                    String cellHashKey = currentCell.hashKey();
                    graph.putIfAbsent(cellHashKey, new ArrayList<>());

                    List<Cell> adjacentNodes = graph.get(cellHashKey);
                    if (row - 1 >= 0 && matrix[row - 1][col] != 0) {
                        adjacentNodes.add(new Cell(row - 1, col));
                    }

                    if (col - 1 >= 0 && matrix[row][col - 1] != 0) {
                        adjacentNodes.add(new Cell(row, col - 1));
                    }

                    if (row + 1 < matrix.length && matrix[row + 1][col] != 0) {
                        adjacentNodes.add(new Cell(row + 1, col));
                    }

                    if (col + 1 < matrix[0].length && matrix[row][col + 1] != 0) {
                        adjacentNodes.add(new Cell(row, col + 1));
                    }
                }
            }
        }
        return graph;
    }

    public List<Cell> findRoute() {
        Map<String, List<Cell>> graph = buildGraph();
        Cell startCell = new Cell(0, 0); // start
        Queue<Cell> queue = new LinkedList<>();
        Map<Cell, Cell> previousNode = new HashMap<>();
        Set<Cell> visited = new HashSet<>();
        List<Cell> finalPath = new LinkedList<>();

        queue.add(startCell);
        visited.add(startCell);

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();

            if (matrix[currentCell.row][currentCell.col] == 2) { // destination found
                finalPath = reconstructPath(previousNode, currentCell);
                break;
            }

            for (Cell neighbor : graph.get(currentCell.hashKey())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    previousNode.put(neighbor, currentCell);
                }
            }
        }
        return finalPath;
    }

    private List<Cell> reconstructPath(Map<Cell, Cell> previousNode, Cell currentCell) {
        List<Cell> path = new LinkedList<>();
        while (currentCell != null) {
            path.add(0, currentCell);
            currentCell = previousNode.get(currentCell);
        }
        return path;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 2},
                {1, 0, 1},
                {0, 1, 1}
        };

        DeliveryArea area = new DeliveryArea(matrix);
        List<Cell> pathToDestination = area.findRoute();

        for (Cell cell : pathToDestination) {
            System.out.println("Row: " + cell.row + ", Col: " + cell.col);
        }
    }
}