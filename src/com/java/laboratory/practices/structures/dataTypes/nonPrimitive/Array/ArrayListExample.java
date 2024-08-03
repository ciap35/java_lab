package com.java.laboratory.practices.structures.dataTypes.nonPrimitive.Array;

import com.java.laboratory.utils.personUtil.PersonUtilsArrayList;
import dto.character.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList =  PersonUtilsArrayList.generatePersons();
        personList
                .stream()
                .filter(x->x.getSex()=='M')
                .map(z ->z.getName()+" " +z.getLastname())
                .forEach(System.out::println);
    }
}
