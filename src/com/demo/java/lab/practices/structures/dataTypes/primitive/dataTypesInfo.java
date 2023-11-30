package com.demo.java.lab.practices.structures.dataTypes.primitive;

public class dataTypesInfo {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("         Primitive Data Types            ");
        System.out.println("=======================================");
        // byte
        System.out.println("byte: Min Value = " + Byte.MIN_VALUE + ", Max Value = " + Byte.MAX_VALUE + ", Size = " + Byte.SIZE + " bits, "+Byte.BYTES+" bytes");

        // short
        System.out.println("short: Min Value = " + Short.MIN_VALUE + ", Max Value = " + Short.MAX_VALUE + ", Size = " + Short.SIZE + " bits, "+Short.BYTES+" bytes");

        // int
        System.out.println("int: Min Value = " + Integer.MIN_VALUE + ", Max Value = " + Integer.MAX_VALUE + ", Size = " + Integer.SIZE +" bits, "+Integer.BYTES+" bytes");

        // long
        System.out.println("long: Min Value = " + Long.MIN_VALUE + ", Max Value = " + Long.MAX_VALUE + ", Size = " + Long.SIZE +" bits, "+Long.BYTES+" bytes");

        // float
        System.out.println("float: Min Value = " + Float.MIN_VALUE + ", Max Value = " + Float.MAX_VALUE + ", Size = " + Float.SIZE + " bits, "+Float.BYTES+" bytes");

        // double
        System.out.println("double: Min Value = " + Double.MIN_VALUE + ", Max Value = " + Double.MAX_VALUE + ", Size = " + Double.SIZE +" bits, "+Double.BYTES+" bytes");

        // char
        System.out.println("char: Min Value = " + (int) Character.MIN_VALUE + ", Max Value = " + (int) Character.MAX_VALUE + ", Size = " + Character.SIZE + " bits, "+Character.BYTES+" bytes");

        // boolean
        System.out.println("boolean: No defined limits (true or false)");
    }
}
