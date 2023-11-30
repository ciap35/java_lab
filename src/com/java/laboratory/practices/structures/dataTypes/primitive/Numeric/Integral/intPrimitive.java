package com.java.laboratory.practices.structures.dataTypes.primitive.Numeric.Integral;

public class intPrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Bits: " + Integer.SIZE);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("maxInt: "+maxInt); //2147483647
        System.out.println("minInt: "+minInt); //-2147483648
        System.out.println("maxInt+1: "+(maxInt+1)); //2147483647 + 1
        System.out.println("minInt-1: "+(minInt-1)); //-2147483648 -1


        int number1 = 121; // Palindrome number
        int number2 = 12345; // Not a palindrome number

        System.out.println(number1 + " is a palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is a palindrome: " + isPalindrome(number2));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
