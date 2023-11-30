package com.java.laboratory.practices;

import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;
import dto.vehicles.Scooter;
import dto.vehicles.Vehicle;

public class InstanceOfExample {
    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle(EngineType.OIL,4,2);
        Vehicle scooter = new Scooter(EngineType.OIL,4,2);
        System.out.println(scooter instanceof Scooter);
        System.out.println(motorcycle instanceof Motorcycle);
        System.out.println(scooter instanceof Vehicle);
        System.out.println(motorcycle instanceof Vehicle);
    }
}
