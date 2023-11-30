package com.demo.java.lab.practices.structures.examples;

import dto.Vehicles.EngineType;
import dto.Vehicles.Motorcycle;
import dto.Vehicles.Vehicle;


public class ComparisonExamples {
    static int counter=0;
    public static void main(String[] args) {
    createAndCompareBikes();
    }
    static void createAndCompareBikes(){
        Vehicle scooter = new Motorcycle(EngineType.OIL,1,2);
        Vehicle superbike = new Motorcycle(EngineType.OIL,4,2);


        compare(scooter,superbike,"Comparing two objects with different values");
        scooter=superbike;
        compare(scooter,superbike,"Comparing two objects after assign itself");

        Vehicle superbike2 = new Motorcycle(EngineType.OIL,4,2);
        Vehicle superbike3 = new Motorcycle(EngineType.OIL,4,2);
        compare(superbike2,superbike3,"Comparing two objects with same values");



    }

    public static void compare(Vehicle vehicle1,Vehicle vehicle2,String message){
        System.out.println();System.out.println();
        System.out.println("****CALL #"+ ++counter +" - "+ message +"****");
        System.out.println("=============MEMORY INFO====================");
        System.out.println("[ vehicle1 identityHashCode ]: " + System.identityHashCode(vehicle1));
        System.out.println("[ vehicle2 identityHashCode ]: " + System.identityHashCode(vehicle2));
        System.out.println("[ vehicle1 MEMORY ADDRESS ]: " + (vehicle1.toString().getBytes()));
        System.out.println("[ vehicle2 MEMORY ADDRESS ]: " + (vehicle2.toString().getBytes()));
        System.out.println("=============COMPARISON====================");

        System.out.println("[ vehicle1==vehicle2 ]: " + (vehicle1==vehicle2));
        System.out.println("[ vehicle1.ComparisonExamples(vehicle2) ]:" + (vehicle1.equals(vehicle2)));
        System.out.println();System.out.println();
    }


}
