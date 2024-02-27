package com.java.laboratory.practices;

import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        printNumbers();
        printReversedArray();
        bubbleSort();
        bubbleSortV2();
        usingArrayObject();
        usingArrayObjectToSortChars();
        findMaxValue();
        findMinValue();
    }

    private static void printNumbers(){
        printHeader("printNumbers");
        /*WRONG
        int[] numbers;
        numbers = {1,2,3,4,5,6};*/

        int[] numbers =  {1,2,3,4,5,6};
        System.out.print("Elements in numbers[]: ");
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private static void printReversedArray(){
        printHeader("printReversedArray");
        /*WRONG
        int[] numbers;
        numbers = {1,2,3,4,5,6};*/

        int[] numbers =  {1,2,3,4,5,6};
        System.out.print("Elements in numbers[]: ");
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(){
        printHeader("bubbleSort");
        int[] numbers =  {5,2,3,4,1,6,0};
        int temp;
        System.out.print("Elements in numbers[]: ");
        printArray(numbers);

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        int iterations = 0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1;j++){
                iterations++;
                if(numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }

        long endTime = System.currentTimeMillis();
        long endNanoTime = System.nanoTime();
        System.out.print("Sorted array: ");
        printArray(numbers);
        System.out.println("Sorted array with BubbleSortV2: "+ (endTime - startTime) + " milliseconds");
        System.out.println("Time taken for bubbleSortV2: " + (endNanoTime - startNanoTime) + " nanoseconds");
        System.out.println("Total iterations for bubbleSortV2: " + iterations);
    }
    private static void bubbleSortV2(){
        printHeader("bubbleSortV2");
        /*WRONG
        int[] numbers;
        numbers = {1,2,3,4,5,6};*/

        int[] numbers =  {5,2,3,4,1,6,0};
        int temp;
        System.out.print("Elements in numbers[]: ");
        printArray(numbers);

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        int iterations = 0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    iterations++;
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }
        long endTime = System.currentTimeMillis();
        long endNanoTime = System.nanoTime();
        System.out.print("Sorted array with BubbleSortV2: ");
        printArray(numbers);
        System.out.println("Time taken for bubbleSortV2: " + (endTime - startTime) + " milliseconds");
        System.out.println("Time taken for bubbleSortV2: " + (endNanoTime - startNanoTime) + " nanoseconds");
        System.out.println("Total iterations for bubbleSortV2: " + iterations);
    }



    //Generics are only compatible with objects, not with primitives
    private static <T> void printArray(T[] array){
        for(int i=0;i<= array.length-1;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] array){
        for(int i=0;i<= array.length-1;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(char[] array){
        for(int i=0;i<= array.length-1;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void usingArrayObject(){
        System.out.print("usingArrayObject: ");
        int[] numbers = {1,5,3,6,4,2};
        Arrays arrayObject; //cannot be instantiated
        Arrays.sort(numbers);
        printArray(numbers);
    }

    private static void usingArrayObjectToSortChars(){
        System.out.print("usingArrayObjectToSortChars: ");
        char[] alphabet = {'f','a','d','e','b','c'};
        Arrays arrayObject; //cannot be instantiated
        Arrays.sort(alphabet);
        printArray(alphabet);
    }

    private static void findMaxValue(){
        printHeader("findMaxValue");
        int[] numbers = {1,6,3,5,4,2,0,80,50,10,88};
        int max=numbers[0];
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]>max) {
                max=numbers[i];
            }
        }
        System.out.println("array Length= "+numbers.length);
        System.out.println("Max: "+max);
        printArray(numbers);
    }
    private static void findMinValue(){
        printHeader("findMinValue");
        int[] numbers = {1,6,3,5,4,2,0,80,50,10,88};
        int min=numbers[0];
        for(int i=0;i<numbers.length-1;i++){
            if( numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("array Length= "+numbers.length);
        System.out.println("Min: "+min);
        printArray(numbers);
    }
    private static void printHeader(String title){
        System.out.println();
        System.out.println("**************************"+title+"**************************");
    }

}
