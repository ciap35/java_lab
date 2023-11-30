package com.demo.java.lab.practices.structures.dataTypes.primitive.Numeric.Integral;

public class longPrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Long.MAX_VALUE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Bits: " + Long.SIZE);


        // Declaration and assignment of long variables
        long num1 = 5000000000L; // Note the 'L' at the end to indicate a long literal
        long num2 = -2000000000L;

        // Operations with longs
        long sum = num1 + num2;
        long difference = num1 - num2;
        long product = num1 * num2;
        long division = num1 / num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // Example of overflow (won't occur with long due to its larger range)
        long maxLong = Long.MAX_VALUE; // 9223372036854775807
        long overflowedLong = maxLong + 1;

        // Print overflow results
        System.out.println("Max Long: " + maxLong);
        System.out.println("Overflowed Long: " + overflowedLong);
    }
}
