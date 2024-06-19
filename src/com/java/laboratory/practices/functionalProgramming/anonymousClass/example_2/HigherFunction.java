package com.java.laboratory.practices.functionalProgramming.anonymousClass.example_2;

public class HigherFunction {

    static void showResult(GeometricShape function,int radio){
        System.out.println("Radio: "+radio);
        System.out.println("Perimeter: "+function.calculatePerimeter(radio));
        System.out.println("Area: "+ function.calculateArea(radio));
    }
    public static void main(String[] args) {
        int radio = 5;

        /*Anonymous class*/
        GeometricShape instanceOfAnonymousClass = new GeometricShape() {
            @Override
            public double calculateArea(int radio) {
                return Math.PI * radio * radio;
            }

            @Override
            public double calculatePerimeter(int radio) {
                return Math.PI * radio;
            }
        };

        showResult(instanceOfAnonymousClass,radio);
    }
}