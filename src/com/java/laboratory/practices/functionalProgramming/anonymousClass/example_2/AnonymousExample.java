package com.java.laboratory.practices.functionalProgramming.anonymousClass.example_2;

public class AnonymousExample{
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

            @Override
            protected void finalize() throws Throwable{
                try{
                    //Clean Code
                }
                finally {
                    super.finalize();
                }
            }

            @Override
            public void close(){
                //Clean code
            }
            public void manualCleanUp(){
                //Clean code
            }
        };
        System.out.println(instanceOfAnonymousClass.calculateArea(radio));
        System.out.println(instanceOfAnonymousClass.calculatePerimeter(radio));
        System.gc();
    }
}
