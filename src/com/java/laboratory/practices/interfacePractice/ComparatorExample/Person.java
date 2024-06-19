package com.java.laboratory.practices.interfacePractice.ComparatorExample;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name, String document) {
        this.age = age;
        this.name = name;
        this.document = document;
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
}
