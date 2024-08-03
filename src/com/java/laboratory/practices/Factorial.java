package com.java.laboratory.practices;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Scanner;

/*
Fórmula: n ( n - 1) !
*/
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(MessageFormat.format("Type a short value between {0} and {1}:",Byte.MIN_VALUE,Byte.MAX_VALUE));
        byte number = scn.nextByte();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        System.out.println("result = " + result);
    }
}
