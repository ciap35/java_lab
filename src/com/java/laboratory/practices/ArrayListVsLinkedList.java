package com.java.laboratory.practices;

import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start;

        // Agregar elementos
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        System.out.println("Time spent adding 100,000 elements at the end in ArrayList: " + (System.nanoTime() - start));

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        System.out.println("Time spent adding 100,000 elements at the end in LinkedList: " + (System.nanoTime() - start));

        // Agregar elementos al principio
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        System.out.println("Time spent adding 100,000 elements at the beginning in ArrayList: " + (System.nanoTime() - start));

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        System.out.println("Time spent adding 100,000 elements at the beginning in LinkedList: " + (System.nanoTime() - start));

        // Eliminar elementos al principio
        start = System.nanoTime();
        arrayList.remove(0);
        System.out.println("Time spent removing 100,000 elements from the beginning in ArrayList: " + (System.nanoTime() - start));

        start = System.nanoTime();
        linkedList.remove(0);
        System.out.println("Time spent removing 100,000 elements from the beginning in LinkedList: " + (System.nanoTime() - start));
        }
}
