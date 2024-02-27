package com.java.laboratory.practices;

import java.io.Reader;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {
        //iterateMultiArray();
        //iterateMultiArrayWithForEach();
        //lookupValueInMatrix();
        //symmetricMatrix();
    }

    private static void iterateMultiArrayWithFor(){
        printHeader("iterateMultiArray");
        /*int[][] fixedArray=new int[1][1];
        multiArray[0][0]=1;
        multiArray[0][1]=2;
        multiArray[1][0]=3;
        multiArray[1][1]=4;*/
        int [][] fixedArray = {{1,2},{3,4}};

        for(int row=0;row<fixedArray.length;row++){
            for(int col=0;col<fixedArray[row].length;col++){
                //System.out.println("Value for fixedArray["+row+"]"+"["+col+"]: "+fixedArray[row][col]);
                //System.out.println(String.format("Value for fixedArray[%d][%d]: %d",row,col,fixedArray[row][col]));
                System.out.println(MessageFormat.format("Value for fixedArray[{0}][{1}]: {2}", row, col, fixedArray[row][col]));
            }
        }


    }

    private static void iterateMultiArrayWithForEach(){
        printHeader("iterateMultiArrayWithForEach");
        /*int[][] fixedArray=new int[1][1];
        multiArray[0][0]=1;
        multiArray[0][1]=2;
        multiArray[1][0]=3;
        multiArray[1][1]=4;*/
        int [][] fixedArray = {{1,2},{3,4}};

        int rowIndex=0,colIndex=0;

        for(int[] row : fixedArray){
            for(int matrixValue : row){
                System.out.println(MessageFormat.format("Values in matrix[{0}][{1}]: {2}", rowIndex, colIndex,matrixValue));
                colIndex++;
            }
            colIndex=0;
            rowIndex++;
        }
    }


    private static void lookupValueInMatrix(){
        int[][] matrix = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        Scanner sc = new Scanner(System.in);
        int valueToFind =0;
        do{
            System.out.println("Input a value between range 1-16, input 0 to exit.");
            valueToFind = sc.nextInt();
        }while(valueToFind==0);


        boolean found = false;
        int row,col;

        lookupLabel: for(int i=0;i<matrix.length;i++){
                        for(int j=0;j<matrix[i].length;j++){
                            if(matrix[i][j]==valueToFind){
                                found = true;
                                row=i;col=j;
                                System.out.println("Founded in: matrix["+row+"]"+"["+col+"]");
                                break lookupLabel;
                            }
                        }
                    }

        if(!found){
            System.out.println("Value not present in matrix");
        }

    }

    private static void symmetricMatrix(){
        //Symmetric
        int[][] matrix = {
                {2,1,3},
                {1,0,-2},
                {3,-2,-1}
        };
        //Asymmetric
        /*int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };*/
        boolean symmetric = true;

        lookupLabel: for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    symmetric = false;
                    System.out.println("Matrix isn't symmetric");
                    break lookupLabel;
                }
            }
        }
        if(symmetric){
            System.out.println("Matrix is symmetric");
        }
    }

    private static void printHeader(String title){
        System.out.println();
        System.out.println("**************************"+title+"**************************");
    }
}
