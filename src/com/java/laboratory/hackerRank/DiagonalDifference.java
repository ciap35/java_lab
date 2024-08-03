package com.java.laboratory.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int size = arr.size(); // Size of each row
        for (int i = 0; i < size; i++) {
            firstDiagonal += arr.get(i).get(i); // [0,0], [1,1], [2,2]; diagonal
            secondDiagonal += arr.get(i).get(size - 1 - i); // [0,2], [1,1], [2,0]; anti-diagonal
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(11, 2, 4));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(10, 8, -12));

        int result = diagonalDifference(matrix);
        System.out.println(result); // Expected output: 15
    }
}
