package com.java.laboratory.practices.generics;

//We can bound the limit of the T and specify more than just one type using & symbol
public class GenericPrinter<T extends Animal> {
    T thingToPrint;

    public GenericPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
    }
}
