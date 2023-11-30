package com.java.laboratory.practices;

import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;

import java.util.Arrays;

public class ByRefOrValueExample {
    public static void main(String[] args) throws CloneNotSupportedException {
    int exampleValuePrimitive = 100;
        incrementValuePrimitive(exampleValuePrimitive);
        System.out.println("exampleValuePrimitive after call method: "+ exampleValuePrimitive);

    Integer exampleValueObject = 100;
        incrementValueObject(exampleValueObject);
        System.out.println("exampleValueObject after call method: "+ exampleValueObject);

    int[] exampleValueRef={1,2};
        incrementValueByRef(exampleValueRef);
        System.out.println("exampleValueRef=[1,2] after call method: ");Arrays.stream(exampleValueRef).forEach(x-> System.out.println(x));
        
        Motorcycle motorcycle = new Motorcycle(EngineType.OIL,4,2);
        System.out.println("motorcycle.getCylinders() = " + motorcycle.getCylinders());
        customize(motorcycle);
        System.out.println("motorcycle.getCylinders() after call customize method= " + motorcycle.getCylinders());

    }

    public static void incrementValuePrimitive(int value){
        value+=1;
    }

    public static void incrementValueObject(Integer value){
        value+=1;
    }

    public static void incrementValueByRef(int[] values){
        for(int i=0;i<=values.length-1;i++)
        {
           values[i] +=1;
        }

    }

    public static void customize(Motorcycle motorcycle) throws CloneNotSupportedException {
        Motorcycle newBike =  motorcycle.clone();
        System.out.println("newBike.hashCode() = " + newBike.hashCode());
        motorcycle.setCylinders(2); //modifies original object
        newBike.setCylinders(3); //Don't modify original object
        Motorcycle sameBike = motorcycle; //Modify original object
        System.out.println("motorcycle.hashCode() = " + newBike.hashCode());
        System.out.println("sameBike.hashCode() = " + sameBike.hashCode());
        System.out.println("newBike.clone() == motorcycle: "+(newBike==motorcycle ? "true - and will modify original object" : "false - and will NOT modify original object"));
        System.out.println("sameBike == motorcycle: "+(sameBike==motorcycle ? "true - and will modify original object" : "false - and will NOT modify original object"));
        sameBike.setCylinders(5); //Modify original object


    }
}
