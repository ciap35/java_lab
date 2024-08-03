package com.java.laboratory.practices.functionalProgramming.anonymousClass.example_2;


public interface GeometricShape extends AutoCloseable {
    double calculateArea(int radio);
    double calculatePerimeter(int radio);
}
