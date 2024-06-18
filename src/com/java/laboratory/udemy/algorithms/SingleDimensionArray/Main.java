package com.java.laboratory.udemy.algorithms.SingleDimensionArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    static SingleDimensionArray singleDimensionArray;
    public static void main(String[] args) {
        singleDimensionArray = new SingleDimensionArray(10);
        //loadArray();
        printTransverseArray_solution0();
        //printTransverseArray_solution1();
        //printTransverseArray_solution2();
        //print();
        //filter();
    }

    private static void printTransverseArray_solution0() {
        /*int index = singleDimensionArray.arr.length-1;
        for(int i=0;i<=singleDimensionArray.arr.length-1;i++){
            System.out.println("["+index+"]"+ " - " + singleDimensionArray.arr[index]);
            index--;
        }*/
        for(int i=singleDimensionArray.arr.length-1;i>=0;i--){
            System.out.println("["+i+"]"+ " - " + singleDimensionArray.arr[i]);
        }
    }

    public static void printTransverseArray_solution2(){
        System.out.println("printTransverseArray_solution2");
        // Convertir el array en un stream, invertir el stream y luego imprimir los elementos
        Arrays.stream(singleDimensionArray.arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
    public static void printTransverseArray_solution1() {
        System.out.println("printTransverseArray_solution1");
        IntStream.range(0,singleDimensionArray.arr.length)
                .mapToObj(i->singleDimensionArray.arr[singleDimensionArray.arr.length-1-i])
                .forEach(System.out::println);
    }

    public void traverseArray(){

    }

    public static void print(){
        System.out.println("PRINT METHOD");
        Arrays.stream(singleDimensionArray.arr).forEach(System.out::println);
    }
    public static void filter(){
        System.out.println("FILTER METHOD");
        Arrays.stream(singleDimensionArray.arr).filter(x->x>=30).forEach(System.out::println);
    }

    static void loadArray(){
        for(int i=0;i<=singleDimensionArray.arr.length-1;i++){
            singleDimensionArray.insert(i,i);
        }
    }
}
