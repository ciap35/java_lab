package com.java.laboratory.udemy.algorithms.TwoDimensionalArray;

import java.text.MessageFormat;
import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] matrix;

    public TwoDimensionalArray(int row,int col){
        matrix  = new int[row][col]; // O(1)
        initialize_version1();
    }

    public void initialize_version1() {
        int counter = 0;
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[0].length;col++){
                matrix[row][col] = ++counter;
            }
        }
    }

    public void print(){
        System.out.println("TwoDimensionalArray.print");
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++){
                System.out.println(MessageFormat.format("matrix[{0}][{1}]={2}",row,col,matrix[row][col]));
            }
        }

    }

    public void printWithStream(){
        System.out.println("TwoDimensionalArray.printWithStream");
        Arrays.stream(matrix).forEach(row->{
            Arrays.stream(row).forEach(value -> System.out.print(value+ " "));
        });
    }

    public int sumAllElements(){
        System.out.println("TwoDimensionalArray.sumAllElements");
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }

    public int findMax(){
        System.out.println("TwoDimensionalArray.findMax");
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElseThrow(()->new RuntimeException("Matrix is empty"));
    }

    public int findMin(){
        System.out.println("TwoDimensionalArray.findMin");
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .min()
                .orElseThrow(()->new RuntimeException("Matrix is empty"));
    }

    public int[] findEventElements(){
        System.out.println("TwoDimensionalArray.findEventElements");
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value % 2 == 0)
                .toArray();
    }

    public int[] findOddElements(){
        System.out.println("TwoDimensionalArray.findOddElements");
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value % 2 == 1)
                .toArray();
    }

    public int[] findElementsGreatherThan(int threshold){
        System.out.println("TwoDimensionalArray.findElementsGreatherThan");
        System.out.println("threshold = " + threshold);
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value > threshold)
                .toArray();
    }

    public int[] findElementsLessThan(int threshold){
        System.out.println("TwoDimensionalArray.findElementsLessThan");
        System.out.println("threshold = " + threshold);
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value < threshold)
                .toArray();
    }

    //"Traverse two dimensional array" in the context of Java means iterating or looping through all the elements of a two-dimensional array.
    public void searchInMatrix(int value){
        System.out.println("TwoDimensionalArray.traverseMatrix");
        int[][] trasversedMatrix = matrix.clone();

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(value==matrix[row][col]){
                    System.out.println(MessageFormat.format("Finded at = matrix[{0}][{1}]={2}",row,col,matrix[row][col]));
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    public void interchangeRowByCol(){
        System.out.println("TwoDimensionalArray.interchangeRowByCol");
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                rotatedMatrix[row][col] = matrix[col][row];
                System.out.println(MessageFormat.format("matrix[{0}][{1}]={2}",row,col,rotatedMatrix[row][col]));
            }
        }
        System.out.println(Arrays.deepToString(rotatedMatrix));

    }
}
