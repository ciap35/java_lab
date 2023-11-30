package com.java.laboratory.practices.structures.dataTypes.primitive.Numeric.FloatingPoint;

public class doublePrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Double.MAX_VALUE);
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Bits: " + Double.SIZE);

        // Declaration and assignment of double variables
        double num1 = 3.14;
        double num2 = -2.5;

        // Operations with doubles
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // Example of precision in double
        double preciseNum = 1.0 / 3.0;
        double phiNumber = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
        System.out.println("Precise Number: " + preciseNum);
        System.out.println("Phi Number: " + phiNumber);//15 decimals = 3.10^-16
    }
}
