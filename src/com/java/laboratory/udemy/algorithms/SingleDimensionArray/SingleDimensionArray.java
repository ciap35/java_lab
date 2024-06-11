package com.java.laboratory.udemy.algorithms.SingleDimensionArray;

import java.util.Arrays;
import java.util.Random;

public class SingleDimensionArray {
        int arr[] = null;
        public SingleDimensionArray(int sizeOfArray){
         arr = new int[sizeOfArray]; // O(1)
         initialize_version1();
        }

        public void initialize_version1(){
            for(int i=0;i<=arr.length-1;i++){
                arr[i] = i;
            }
        }
        public void initialize_version2(){
            Arrays.fill(arr,0,arr.length, 0); // O(1)
        }

        public void insert(int location, int valueToBeInserted){
            try{
            if(arr[location] == Integer.MIN_VALUE){ // O(1)
                arr[location] = valueToBeInserted; // O(1)
                System.out.println("Successfully inserted"); // O(1)
            }
            else{ // O(1)
                System.out.println("This cell is already occupied"); // O(1)
            }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index to access array!"); // O(1)
            }
        }
}