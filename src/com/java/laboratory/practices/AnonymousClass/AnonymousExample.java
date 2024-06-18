package com.java.laboratory.practices.AnonymousClass;

public class AnonymousExample {
    public static void main(String[] args) {

        int radio = 5;
        GeometricShape instanceOfAnonymousClass = new GeometricShape(){
            @Override
            public double calculateArea(int radio) {
                return Math.PI*radio*radio;
            }

            @Override
            public double calculatePerimeter(int radio) {
                return Math.PI*radio;
            }
        };
        System.out.println(instanceOfAnonymousClass.calculateArea(radio));
        System.out.println(instanceOfAnonymousClass.calculatePerimeter(radio));
    }
}
