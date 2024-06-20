package com.java.laboratory.practices.functionalProgramming.dto;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public boolean isMale() {
        return male;
    }

    private boolean male = true;

    public Person(int age, String name, String document) {
        this.age = age;
        this.name = name;
        this.document = document;
    }

    public Person(int age, String name, String document,boolean male) {
        this.age = age;
        this.name = name;
        this.document = document;
        this.male = male;
    }

    private String document;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
    // Overriding hashCode method
    /*@Override
    public int hashCode() {
        return Objects.hash(age, name, document, isMale());
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age &&
                isMale() == person.isMale() &&
                name.equals(person.name) &&
                document.equals(person.document);
    }
}
