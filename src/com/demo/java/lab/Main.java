package com.demo.java.lab;

import dto.Vehicles.EngineType;
import dto.Vehicles.Motorcycle;
import dto.Vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        createBikes();
    }

    public static void createBikes(){
        Vehicle scooter = new Motorcycle(EngineType.OIL,1,2);
        System.out.println("Engine: "+(scooter.isTurnedOn()?"Started":"Turned off"));
        scooter.start();
        System.out.println("Engine: "+(scooter.isTurnedOn()?"Started":"Turned off"));
        System.out.println(scooter);

        Vehicle superbike = new Motorcycle(EngineType.OIL,4,2);
        System.out.println("Engine: "+(superbike.isTurnedOn()?"Started":"Turned off"));
        superbike.start();
        System.out.println("Engine: "+(superbike.isTurnedOn()?"Started":"Turned off"));
        System.out.println(superbike);
        System.out.println("Scooter is equal to SuperBike: "+scooter.equals(superbike));
    }
}
