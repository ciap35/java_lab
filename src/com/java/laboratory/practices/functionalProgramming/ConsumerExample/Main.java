package com.java.laboratory.practices.functionalProgramming.ConsumerExample;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.java.laboratory.ConsoleTextColour;
import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Create personList
        List<Person> personList = createPersonList();
        //Create consumer
        Consumer<Person> printJob = printDateProcess();
        //process
        process(personList,printJob);


    }
    static List<Person> createPersonList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(34,"Nacho","11111111"));
        personList.add(new Person(43,"Juan","11111111"));
        personList.add(new Person(26,"Vladimir","11111111"));
        personList.add(new Person(34,"Luisa","11111111",false));
        return personList;
    }

    static Consumer<Person> printDateProcess(){
        /*
        if the consumer only has one line.
        Consumer<Person> print = System.out::println;
        */
        return new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(ConsoleTextColour.ANSI_YELLOW.getColour()+ " PROCESSED AT: "+ LocalDateTime.now()+ " " + ConsoleTextColour.ANSI_CYAN.getColour()+ person+ConsoleTextColour.ANSI_RESET.getColour());
            }
        };
    }

    static void process(List<Person> personList, Consumer<Person> consumer){
        for(Person p:personList){
            consumer.accept(p);
        }
    }
}
