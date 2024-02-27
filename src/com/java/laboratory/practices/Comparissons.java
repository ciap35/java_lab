package com.java.laboratory.practices;

import com.java.laboratory.ConsoleTextColour;
import dto.character.Person;
import dto.vehicles.EngineType;
import dto.vehicles.Motorcycle;

public class Comparissons {
    public static void main(String[] args) {
        Person person1 = new Person("John","Doe",'M');
        Person person2 = new Person("John","Doe",'M');
        System.out.println("person1==person2: "+ ConsoleTextColour.ANSI_YELLOW.getColour()+(person1==person2)+ConsoleTextColour.ANSI_RESET.getColour());

        System.out.println("person1.equals(person2): "+ConsoleTextColour.ANSI_YELLOW.getColour()+person1.equals(person2)+ConsoleTextColour.ANSI_RESET.getColour());
        Motorcycle moto = new Motorcycle(EngineType.OIL,2,2);
        person1.equals(moto); //false
    }
}
