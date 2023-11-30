package com.java.laboratory.practices.structures.dataTypes.primitive.Numeric.FloatingPoint;

public class floatPrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Float.MAX_VALUE);
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Bits: " + Float.SIZE);

        // Declaration and assignment of float variables
        float num1 = 3.14f; // Note the 'f' at the end to indicate a float literal
        float num2 = -2.5f;
        float num3 = 2.10e3f;
        float num4 = 2.10e-3f;

        // Operations with floats
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float division = num1 / num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);



        // Example of precision in float
        float preciseNum = 1.0f / 3.0f;
        float phiNumber = 3.141592653589793238462643383279502884197169399375105820974944592307816406286f;
        System.out.println("Precise Number: " + preciseNum);
        System.out.println("Phi Number: " + phiNumber);//Phi Number: 3.1415927 it will round
        System.out.println( "num3 = "+num3+" = 2.10e3f");
        System.out.println( "num4 = "+num4+" = 2.10e-3f");
    }

    /*NOTES:
    Similarly to double, keep in mind that floating-point numbers, including float, may not represent decimal values with perfect precision due to the nature of their representation in binary. If precise decimal representation is critical, consider using BigDecimal
    * */
}
