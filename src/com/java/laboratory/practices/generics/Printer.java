package com.java.laboratory.practices.generics;

public class Printer {
    public static void main(String[] args) {
        GenericPrinter cat = new GenericPrinter<Cat>(new Cat());
        GenericPrinter dog = new GenericPrinter<Dog>(new Dog());
        cat.print();
        dog.print();
    }
}
