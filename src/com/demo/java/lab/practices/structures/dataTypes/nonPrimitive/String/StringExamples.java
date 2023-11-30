package com.demo.java.lab.practices.structures.dataTypes.nonPrimitive.String;

import java.nio.charset.StandardCharsets;

public class StringExamples {
    public static void main(String[] args) {
        String strValue1 = new String("Hello World");
        String strValue2 = new String("Hello World");

        System.out.println("[ strValue1 identityHashCode ]: " + System.identityHashCode(strValue1));
        System.out.println("[ strValue2 identityHashCode ]: " + System.identityHashCode(strValue2));
        System.out.println("[ strValue1 MEMORY ADDRESS ]: " + (strValue1.getBytes()));
        System.out.println("[ strValue2 MEMORY ADDRESS ]: " + (strValue2.getBytes()));
        System.out.println("=============COMPARISON====================");

        System.out.println("[ strValue1==strValue2 ]: " + (strValue1==strValue2));
        System.out.println("[ strValue1.ComparisonExamples(strValue2) ]:" + (strValue1.equals(strValue2)));
        System.out.println("[ strValue1.ComparisonExamples(strValue2) ]:" + (strValue1.equals(strValue2)));
        System.out.println("[ strValue1.length() ]: " +strValue1.length());
        System.out.println("[ strValue1.getBytes(StandardCharsets.UTF_8) ]:" +strValue1.getBytes(StandardCharsets.UTF_8));

        System.out.println("=================================");
        String strValue3 = "Hello World"; //If you not force the instance of new String the identityHashCode will be the same. Same value on heap, different object on Stack.
        String strValue4 = "Hello World"; //If you not force the instance of new String the identityHashCode will be the same. Same value on heap, different object on Stack.


        System.out.println("[ strValue3 identityHashCode ]: " + System.identityHashCode(strValue3)); //Same Identity for this String
        System.out.println("[ strValue4 identityHashCode ]: " + System.identityHashCode(strValue4)); //Same Identity for this String
        System.out.println("[ strValue3 MEMORY ADDRESS ]: " + (strValue3.getBytes())); //different addresses for the value on the HEAP
        System.out.println("[ strValue4 MEMORY ADDRESS ]: " + (strValue4.getBytes())); //different addresses for the value on the HEAP

        System.out.print("[ strValue3==strValue4 ]: ");
        System.out.print(strValue3==strValue4); //true
        System.out.println();
        System.out.print("[ strValue3.ComparisonExamples(strValue4) ]:");
        System.out.print(strValue3.equals(strValue4)); //true
    }
}
