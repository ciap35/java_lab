package com.java.laboratory.practices.functionalProgramming.anonymousClass.example_1;

public class Main {
    public static void main(String[] args) {
        /*Anonymous class*/
        Incrementable anonymousClass = new Incrementable() {
            @Override
            public int increment(int n) {
                return n*n; //Returns the square of n
            }
        };
        System.out.println("Logic from anonymousClass: " + anonymousClass.increment(3));

        /*Anonymous class -  overriding method with lambda expression*/
        Incrementable incrementerWithLambda = (myParameter) -> {
            return myParameter*myParameter*myParameter ;
        };
        System.out.println("Logic from incrementerWithLambda: " + incrementerWithLambda.increment(3));

        /*Anonymous class -  overriding method with lambda expression - Shortest way*/
        Incrementable incrementerWithLambdaReduced = (myParameter) -> myParameter*myParameter*myParameter;
        System.out.println("Logic from incrementerWithLambdaReduced: " + incrementerWithLambda.increment(3));

        /*Using concrete class*/
        Incrementer increment = new Incrementer();
        System.out.println("Logic from Incrementer class: " + increment.increment(3));
    }
}
