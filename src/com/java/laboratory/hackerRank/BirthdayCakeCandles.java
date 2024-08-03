package com.java.laboratory.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    /**
     * Calcula la cantidad de velas con la mayor altura.
     *
     * @param candles Lista de alturas de velas.
     * @return La cantidad de velas con la mayor altura.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<Integer,Integer> candleSet = new HashMap<>();

        for(int candle : candles){
            if(!candleSet.containsKey(candle)){
                candleSet.put(candle, 1);
            }else{
                candleSet.put(candle,candleSet.get(candle)+1);
            }
        }
        int maxValue = candleSet.values().stream().max(Integer::compare).orElse(0);
        return maxValue;
    }

    public static void main(String[] args) {
        // Ejemplo de uso con una lista de alturas de velas
        List<Integer> candles = List.of(3, 1, 4, 1, 2, 3, 3);
        int result = birthdayCakeCandles(candles);
        System.out.println("Number of candles with the maximum height: " + result);
    }
}
