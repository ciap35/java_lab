package com.java.laboratory.practices.structures.examples;

import java.util.HashMap;
import java.util.Set;

public class HashMapExamples {

    public static void main(String[] args) {
        charFrequency();
    }

    public static void charFrequency(){
        //Set<String> charFreqSet = new HashSet<>();
        HashMap<Character,Integer> charFreqSet = new HashMap<>();
        //String textToAnalyze = "Hi this is a text, and the intention is to analyze the frequency of each char in this phrase";
        String textToAnalyze = "aaabbbbccccdddddeeeeefffggghhhiiiiiijjjkkklllmmmnnooppprrssstuvvwxyz";
        int totalCounter = 0;
        for(char letter : textToAnalyze.toCharArray()){
            int counter = 0;
            if(charFreqSet.containsKey(letter)){
                counter = charFreqSet.get(letter);
            }
            //way 1
            //counter+=1;
            //charFreqSet.put(letter,counter);
            //way 2
            charFreqSet.put(letter,++counter); //It works and it's like counter+=1;

            //charFreqSet.put(letter,counter++); will no assign the value to the variable, it will print 0
        }

        System.out.println("forEachOrdered");
        long start = System.currentTimeMillis();
        charFreqSet.keySet().stream().parallel().forEachOrdered(x-> System.out.println(x+" - frequency: "+charFreqSet.get(x)));
        long end = System.currentTimeMillis();
        System.out.println("takes: "+(end-start)+"ms");

        System.out.println();
        System.out.println("foreach: ");
        start = System.currentTimeMillis();
        charFreqSet.keySet().stream().parallel().forEach(x-> System.out.println(x+" - frequency: "+charFreqSet.get(x)));
        end = System.currentTimeMillis();
        System.out.println(end-start+"ms");

        System.out.println("total values: "+ (long) charFreqSet.keySet().size());
    }


}
