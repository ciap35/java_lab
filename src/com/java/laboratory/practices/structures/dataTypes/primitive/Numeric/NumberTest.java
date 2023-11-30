package com.java.laboratory.practices.structures.dataTypes.primitive.Numeric;

import java.math.BigDecimal;
import java.util.HashSet;

public class NumberTest {
    public static void main(String[] args) {
        testNumbers();
    }

    public static void testNumbers(){
        HashSet<Number> numberHashSet = new HashSet<>();
        //List<Number> numberHashSet = new ArrayList<>();
        numberHashSet.add(Integer.MAX_VALUE);
        numberHashSet.add(Long.MAX_VALUE);
        numberHashSet.add(Double.MAX_VALUE);
        numberHashSet.add(Float.MAX_VALUE);
        numberHashSet.add(Byte.MAX_VALUE);
        numberHashSet.add(Short.MAX_VALUE);
        numberHashSet.add(BigDecimal.ONE);
        System.out.println();
        System.out.println("=======================================");
        numberHashSet.stream().forEach(x-> System.out.println(x + " - "+ x.getClass()));
        System.out.println("=======================================");
        numberHashSet.stream().forEach(x-> {
            if(x instanceof Integer){
                    System.out.println("Contains an Integer");
            }
            if(x instanceof Long){
                System.out.println("Contains an Long");
            }
            if(x instanceof Short){
                System.out.println("Contains an Short");
            }
            if(x instanceof Double){
                System.out.println("Contains an Double");
            }
            if(x instanceof Float){
                System.out.println("Contains an Float");
            }
            if(x instanceof Byte){
                System.out.println("Contains an Byte");
            }
            if(x instanceof BigDecimal){
                System.out.println("Contains an BigDecimal");
            }
        });
    }
}
