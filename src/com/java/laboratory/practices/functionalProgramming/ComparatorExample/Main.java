package com.java.laboratory.practices.functionalProgramming.ComparatorExample;

import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(34,"Nacho","11111111"));
        personList.add(new Person(43,"Juan","11111111"));
        personList.add(new Person(26,"Vladimir","11111111"));
        personList.add(new Person(34,"Luisa","11111111"));
        fromYoungest(personList);
        fromOldest(personList);
        compareByNameAscending(personList);
        compareByNameDescending(personList);
    }



    public static void fromYoungest(List<Person> personList){
        System.out.println("Main.fromYoungest");
        ComparatorExample customComparator = new ComparatorExample();
        personList.sort(customComparator);
        for(Person p : personList){
            System.out.println(p);
        }
        System.out.println();
    }

    public static void fromOldest(List<Person> personList){
        fromOldest_overrideWithLambda(personList);
        fromOldest_overrideWithAnonymousClass(personList);
    }

    public static void fromOldest_overrideWithAnonymousClass(List<Person> personList){
        System.out.println("Main.fromOldest_overrideWithAnonymousClass");
        ComparatorExample customComparator = new ComparatorExample();
        //Overriding Comparator using lambda expression
        personList.sort(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        for(Person p : personList){
            System.out.println(p);
        }
        System.out.println();
    }

    public static void fromOldest_overrideWithLambda(List<Person> personList){
        System.out.println("Main.fromOldest_overrideWithLambda");
        ComparatorExample customComparator = new ComparatorExample();
        //Overriding Comparator using lambda expression
        personList.sort((o1, o2) -> o2.getAge() - o1.getAge());

        for(Person p : personList){
            System.out.println(p);
        }
        System.out.println();
    }

    public static void compareByNameAscending(List<Person> personList){
        System.out.println("Main.compareByNameAscending");
        Comparator<Person> compareByName = (p1,p2) -> p1.getName().compareTo(p2.getName());
        personList.sort(compareByName);
        
        personList.forEach(p -> System.out.println("p = " + p));
        System.out.println();
    }

    public static void compareByNameDescending(List<Person> personList){
        System.out.println("Main.compareByNameDescending");
        Comparator<Person> compareByName = (p1,p2) -> p2.getName().compareTo(p1.getName());
        personList.sort(compareByName);

        personList.forEach(p -> System.out.println("p = " + p));
        System.out.println();
    }





}
