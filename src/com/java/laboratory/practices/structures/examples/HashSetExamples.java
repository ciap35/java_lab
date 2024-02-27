package com.java.laboratory.practices.structures.examples;

import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;
import dto.vehicles.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) throws CloneNotSupportedException {
        puttingRepittedObjects();
    }

    private static void puttingRepittedObjects() throws CloneNotSupportedException {
            Set<Motorcycle> charFreqSet = new HashSet<>();
            Motorcycle superBike = new Motorcycle(EngineType.OIL,4,2);
            Motorcycle superBikeTwin = superBike.clone();
            superBike.setCylinders(3);
            Motorcycle chopperBike = new Motorcycle(EngineType.OIL,2,2);
            charFreqSet.add(superBike);
            charFreqSet.add(superBike);
            charFreqSet.add(superBikeTwin);
            charFreqSet.add(chopperBike);
            charFreqSet.add(chopperBike);

            for(Motorcycle motorcycle : charFreqSet){
                System.out.println(motorcycle.getClass().toString().getBytes());
            }

            if(superBike==superBikeTwin){
                System.out.println("They are identical");
            }

            if(superBike.equals(superBikeTwin)){
                System.out.println("They have same values");
            }

            //Will print only bike and superbike
    }
}
