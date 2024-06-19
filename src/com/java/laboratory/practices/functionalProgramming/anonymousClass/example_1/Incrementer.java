package com.java.laboratory.practices.functionalProgramming.anonymousClass.example_1;

public class Incrementer implements Incrementable {

    @Override
    public int increment(int n) {
        return n+1;
    }
}
