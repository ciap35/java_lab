package com.java.laboratory.hackerRank;

import com.java.laboratory.ConsoleTextColour;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static void main(String[] args)  {
        String result = CaesarCipher.caesarCipher("middle-Outz", 2);
        System.out.println("Result: "+ ConsoleTextColour.ANSI_YELLOW.getColour() +result+ConsoleTextColour.ANSI_RESET.getColour());
    }


    //private static final Map<Character,Integer> alphabet = buildAlphabet();
    private static final Map<Character,Integer> alphabetIndexed = buildAlphabet();
    private static final char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //length = 26;

    public static String caesarCipher(String s, int k) {

        StringBuilder result = new StringBuilder();
        for(Character letter : s.toCharArray()){
            String temp;
            String lookupResult=letter.toString();

            int iterations = k > alphabet.length ? k%alphabet.length : k;
            int jump = 0;
            int positionLetter =0;
            //if(alphabetIndexed.get(letter.toString().toLowerCase().toCharArray()[0])!=null){
            if(Character.isLetter(letter) && Character.isUpperCase(letter)){
                Character lowerChar = letter.toString().toLowerCase().toCharArray()[0];
                jump = calculateJump(iterations,lowerChar);
                lookupResult = Character.valueOf(alphabet[jump]).toString().toUpperCase();
            }
            else if(Character.isLetter(letter)){
                jump = calculateJump(iterations,letter);
                lookupResult = Character.valueOf(alphabet[jump]).toString();
            }
            else{
                lookupResult = letter.toString();
            }

            result.append(lookupResult);
    }   return result.toString();
    }

    private static int calculateJump(int iterations,Character letter){
        int positionLetter = alphabetIndexed.get(letter).intValue();
        if(positionLetter+iterations>alphabet.length-1){
            return (positionLetter+iterations-alphabet.length);
        }
        else{
            return positionLetter+iterations;
        }
    }

    private static Map<Character,Integer> buildAlphabet(){
        char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Map<Character,Integer> alphabetMap= new HashMap<>();
        int index = 0;
        for(char letter : alphabet){
            alphabetMap.put(letter,index);
            index++;
        }
        return alphabetMap;
    }
}


