package com.java.laboratory.practices.structures.dataTypes.primitive.Boolean;


public class booleanPrimitive {
    public static void main(String[] args) {
    boolean trueCondition = true;
    boolean falseCondition = false;
        System.out.println("trueCondition:"+trueCondition);
        System.out.println("falseCondition"+falseCondition);
        System.out.println(trueCondition==falseCondition);
        System.out.println(trueCondition!=falseCondition);
        falseCondition = !trueCondition;
        System.out.println("falseCondition: "+falseCondition);
    }
}
