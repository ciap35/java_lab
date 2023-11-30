package com.demo.java.lab.practices.structures.dataTypes.primitive.Character;

public class charPrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Character.MAX_VALUE);
        System.out.println("Min: " + Character.MIN_VALUE);
        System.out.println("Bytes: " + Character.BYTES);
        System.out.println("Bits: " + Character.SIZE);

        char[] word1;// "radar";
        word1 = new char[]{'r','a','d','a','r'};
        //String word2 = "hello";
        char[] word2 = new char[]{'h','e','l','l','o'};

        char atSymbol = '\u0040';

        System.out.println(atSymbol+" symbol in UNICODE map is represented by \\u0040");

        System.out.println("Memory address: "+word1+" String value: "+ String.valueOf(word1) + " is a palindrome: " + isPalindrome(word1));
        System.out.println("Memory address: "+word2+" String value: "+ String.valueOf(word2) + " is a palindrome: " + isPalindrome(word2));
        System.out.println(String.valueOf(word1) + " reversed = " + reverse(word1));
        System.out.println(String.valueOf(word2) + " reversed = " + reverse(word2));
    }

    public static boolean isPalindrome(char[] characters) {
        //if characters were String type
        //char[] characters = word.toCharArray();

        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the beginning and the end
            if (characters[i] != characters[length - 1 - i]) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome
    }

    public static String reverse(char[] characters) {
        //if characters were String type
        //char[] characters = word.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            // Swap characters from the beginning and the end
            char temp = characters[i];
            characters[i] = characters[length - 1 - i];
            characters[length - 1 - i] = temp;
        }

        return new String(characters);
    }
}
