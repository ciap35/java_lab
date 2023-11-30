package com.java.laboratory.practices;

import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;
import dto.vehicles.Vehicle;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ClassExample {
    public static void main(String[] args) {
        Vehicle scooter = new Motorcycle(EngineType.OIL,1,2);
        Vehicle superbike = new Motorcycle(EngineType.OIL,4,2);
        System.out.println("scooter.getClass().getClassLoader(): "+scooter.getClass().getClassLoader());
        System.out.println("scooter.getClass().getName(): "+scooter.getClass().getName());
        System.out.println("scooter.getClass().getMethods(): "+ Arrays.stream(scooter.getClass().getMethods()).collect(Collectors.toSet()).iterator().next());
        System.out.println("scooter.getClass().getDeclaredFields(): "+ Arrays.stream(scooter.getClass().getDeclaredFields()).collect(Collectors.toList()));
    }

}
