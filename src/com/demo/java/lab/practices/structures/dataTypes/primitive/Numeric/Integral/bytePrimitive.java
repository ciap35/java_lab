package com.demo.java.lab.practices.structures.dataTypes.primitive.Numeric.Integral;
/*
**/
public class bytePrimitive {
    public static void main(String[] args) {
        System.out.println("Max: " + Byte.MAX_VALUE);
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Bits: " + Byte.SIZE);

        // Declaration and assignment of byte variables
        byte myByte = 42;
        byte anotherByte = -10;

        // Operations with bytes
        byte sum = (byte) (myByte + anotherByte); // Explicit casting to byte is required
        byte difference = (byte) (myByte - anotherByte);
        byte product = (byte) (myByte * anotherByte);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Example of overflow
        byte maxByte = Byte.MAX_VALUE; // 127
        byte overflowedByte = (byte) (maxByte + 1);

        // Print overflow results
        System.out.println("Max Byte: " + maxByte);
        System.out.println("Overflowed Byte: " + overflowedByte);
    }
    /**
     * The value of product is 92 because it results from the multiplication of myByte and anotherByte in the following line:
     *
     * java
     * Copy code
     * byte product = (byte) (myByte * anotherByte);
     * Let's break it down:
     *
     * myByte is assigned the value 42.
     * anotherByte is assigned the value -10.
     * The product is calculated as myByte * anotherByte, which is 42 * (-10) = -420.
     * Since the result -420 is outside the valid range for a byte (-128 to 127), an overflow occurs.
     * When casting the result back to a byte, it wraps around within the byte range. In this case, -420 wraps around to 92.
     * So, the overflow caused the unexpected result of 92 for the product. This is an example of how overflow can occur when working with primitive types, and it's important to be aware of the range limitations of data types in Java.
     *
     */
}
