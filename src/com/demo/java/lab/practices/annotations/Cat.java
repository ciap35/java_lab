package com.demo.java.lab.practices.annotations;

@VeryImportant
public class Cat {
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Required
    String name;

    @RunImmediately(times = 3)
    public void feed(){
        System.out.println("Feeding the cat");
    }

}
