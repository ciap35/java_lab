package com.java.laboratory.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        // Ejemplo de uso con el input proporcionado
        List<Integer> numbers = List.of(
                769082435,
                210437958,
                673982045,
                375809214,
                380564127
        ); // Lista de enteros
        solution1(numbers); // Llamada a la función
    }

    public static void solution1(List<Integer> arr) {
        // Write your code here
        long minimumSum = 0L,maximumSum = 0L;
        List<Integer> arrSortedAsc = new ArrayList<>(arr);
        arrSortedAsc.sort((a,b)-> (a-b));
        List<Integer> arrSortedDesc = new ArrayList<>(arr);
        arrSortedDesc.sort((a,b)-> (b-a));
        for(int i=0;i<arr.size()-1;i++){
            minimumSum += arrSortedAsc.get(i);
            maximumSum += arrSortedDesc.get(i);
        }
        System.out.println(minimumSum+" "+maximumSum);
    }

    public static void solution2(List<Integer> arr){
        // Crear una copia de la lista original
        List<Integer> arrSorted = new ArrayList<>(arr);
        // Ordenar la lista en orden ascendente
        arrSorted.sort((a, b) -> Integer.compare(a, b));

        // Calcular la suma mínima y máxima
        long minimumSum = 0;
        long maximumSum = 0;
        int size = arrSorted.size();

        for (int i = 0; i < size - 1; i++) {
            minimumSum += arrSorted.get(i);
        }
        for (int i = 1; i < size; i++) {
            maximumSum += arrSorted.get(i);
        }

        System.out.println(minimumSum + " " + maximumSum);
    }
}
