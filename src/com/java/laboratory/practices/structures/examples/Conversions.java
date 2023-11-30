package com.java.laboratory.practices.structures.examples;

public class Conversions {


    public static void main(String[] args) {
    parsing();
    printLine();
    }

    public static void parsing(){
    String realStr = "98765.43e-3";
    double realDouble = Double.parseDouble(realStr);
    System.out.println("realDouble  ="+realDouble);

    String logicStr = "TrUe";
    boolean logicBoolean = Boolean.parseBoolean(logicStr);
    System.out.println("logicBoolean = "+logicBoolean);

    String logicStr0 = "0";
    boolean logicBoolean0 = Boolean.parseBoolean(logicStr0);
    System.out.println("logicBoolean0 = "+logicBoolean0);

    String logicStr1 = "1";
    boolean logicBoolean1 = Boolean.parseBoolean(logicStr1);
    System.out.println("logicBoolean1 = "+logicBoolean1);

    int numbInt = 100;
    System.out.println("numbInt = "+numbInt);

    String numberStr = String.valueOf(numbInt);
    System.out.println("numberStr = "+numberStr);

    double doubleValue = -1234.2;
    String realStr2 = Double.toString(doubleValue);
    System.out.println("realStr2 = "+realStr2);

    double doubleValue3 = -1234.2e-3;
    String realStr3 = Double.toString(doubleValue3);
    System.out.println("realStr2 = "+realStr3);
    }

    public static void printLine(){
        System.out.println("============================================================");
    }

    public static void cast(){
        Integer intValue = Integer.MAX_VALUE;
        //Short shortValue = intValue; //error
        Short shortValue = intValue.shortValue();
        System.out.println("value for shortValue = " + shortValue);
    }
}
