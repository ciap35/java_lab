package com.java.laboratory.utils.personUtil;


import dto.character.Person;

import java.util.LinkedList;
import java.util.List;

public class PersonUtilsLinkedList {

    public static List<Person> generatePersons() {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("John", "Doe", 'M'));
        persons.add(new Person("Jane", "Smith", 'F'));
        persons.add(new Person("Carlos", "Aguilera", 'M'));
        persons.add(new Person("Maria", "Garcia", 'F'));
        persons.add(new Person("Pedro", "Martinez", 'M'));
        persons.add(new Person("Luisa", "Fernandez", 'F'));
        persons.add(new Person("Javier", "Lopez", 'M'));
        persons.add(new Person("Isabella", "Gomez", 'F'));
        persons.add(new Person("Mateo", "Perez", 'M'));
        persons.add(new Person("Sofia", "Ramirez", 'F'));

        return persons;
    }

    public static void main(String[] args) {
        List<Person> people = generatePersons();
        people.forEach(System.out::println);
    }
}