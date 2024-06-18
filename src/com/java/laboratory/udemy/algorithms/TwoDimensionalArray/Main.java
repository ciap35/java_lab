package com.java.laboratory.udemy.algorithms.TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] matrix;
        matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        System.out.println(Arrays.deepToString(matrix));

        //All together
        String sMatrix[][] = {{"a","b"},{"c","d"}};

        System.out.println(Arrays.deepToString(sMatrix));

        TwoDimensionalArray customMatrix = new TwoDimensionalArray(3,3);
        customMatrix.print();

        System.out.println("Arrays.deepToString: "+ Arrays.deepToString(customMatrix.matrix));
        customMatrix.printWithStream();
        System.out.println();
        System.out.println(customMatrix.sumAllElements());
        System.out.println(customMatrix.findMax());
        System.out.println(customMatrix.findMin());
        System.out.println(Arrays.toString(customMatrix.findEventElements()));
        System.out.println(Arrays.toString(customMatrix.findOddElements()));
        System.out.println(Arrays.toString(customMatrix.findElementsGreatherThan(2)));
        System.out.println(Arrays.toString(customMatrix.findElementsLessThan(5)));
        customMatrix.searchInMatrix(3);
        customMatrix.searchInMatrix(9999);
        customMatrix.interchangeRowByCol();

    }
}
