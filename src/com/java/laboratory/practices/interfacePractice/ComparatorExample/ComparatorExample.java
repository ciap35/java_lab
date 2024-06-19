package com.java.laboratory.practices.interfacePractice.ComparatorExample;


import java.util.Comparator;
public class ComparatorExample implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge(); // youngest to oldest
        //return o2.getAge() - o1.getAge(); //oldest to youngest
    }
}
