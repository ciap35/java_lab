package com.java.laboratory.practices.structures.dataTypes.nonPrimitive.LinkedList;

import com.java.laboratory.utils.personUtil.PersonUtilsArrayList;
import com.java.laboratory.utils.personUtil.PersonUtilsLinkedList;
import dto.character.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        personList =  PersonUtilsLinkedList.generatePersons();

        Person person = personList.get(0);
        personList.remove(1);
        personList.remove(person);
        List<Person> subList =  personList.subList(0,3);
        subList.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();

        personList
                .stream()
                .filter(x->x.getSex()=='M')
                .map(z ->z.getName()+" " +z.getLastname())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        personList.stream().forEachOrdered(System.out::println);
    }

    }

