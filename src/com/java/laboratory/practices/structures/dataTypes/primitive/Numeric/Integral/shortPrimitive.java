package com.java.laboratory.practices.structures.dataTypes.primitive.Numeric.Integral;

public class shortPrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Short.MAX_VALUE);
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Bits: " + Short.SIZE);

        // Declaration and assignment of short variables
        short num1 = 1000;
        short num2 = -500;

        // Operations with shorts
        short sum = (short) (num1 + num2); // Explicit casting to short is required, operations return an int
        short difference = (short) (num1 - num2);
        short product = (short) (num1 * num2);
        short division = (short) (num1 / num2);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // Example of overflow
        short maxShort = Short.MAX_VALUE; // 32767
        short minShort = Short.MIN_VALUE; // 32767
        short overflowedShort = (short) (maxShort + 1);

        // Print overflow results
        System.out.println("Overflowed Short: " + overflowedShort);
    }
}
