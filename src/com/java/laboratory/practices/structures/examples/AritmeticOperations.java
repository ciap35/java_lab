package com.java.laboratory.practices.structures.examples;

public class AritmeticOperations {
    public static void main(String[] args) {
        aritmeticOperation1();
    }

    public static void aritmeticOperation1(){
        int intValue1 = 100%2;
        System.out.println("intValue1 = " + intValue1);
        int intValue2 = 101%2;
        System.out.println("intValue2 = " + intValue2);


        float floatValue1 = (float)Math.PI/2;
        System.out.println("Float size: "+Float.BYTES);
        System.out.println("floatValue1 = " + floatValue1);
        float floatValue2 = (float)Math.PI%2;
        System.out.println("floatValue1 = " + floatValue2);

        double doubleValue1 = Math.PI/2;
        System.out.println("Double size: "+Double.BYTES);
        System.out.println("doubleValue1 = " + doubleValue1);
        double doubleValue2 = Math.PI%2;
        System.out.println("doubleValue2 = " + doubleValue2);


    }
}
