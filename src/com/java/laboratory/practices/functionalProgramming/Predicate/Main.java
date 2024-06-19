package com.java.laboratory.practices.functionalProgramming.Predicate;

import com.java.laboratory.ConsoleTextColour;
import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = createPersonList();


        /*Create the predicates*/

        //1-Predicate for filter only adults
        //Predicate<Person> adult = p-> { return p.getAge() >= 18; };
        //This is equivalent to the previous line
        Predicate<Person> adult = p->  p.getAge() >= 18;



        System.out.println(ConsoleTextColour.ANSI_YELLOW.getColour()+"ADULT's LIST"+ConsoleTextColour.ANSI_RESET.getColour());
        List<Person> adults = filter(personList,adult);
        adults.forEach(System.out::println);
        System.out.println();


        //2-Predicate for filter only females
        Predicate<Person> female = p-> !p.isMale();

        System.out.println(ConsoleTextColour.ANSI_YELLOW.getColour()+"FEMALE's LIST"+ConsoleTextColour.ANSI_RESET.getColour());
        List<Person> females = filter(personList,female);
        females.forEach(System.out::println);


        //3-Predicate with multiple conditions
        System.out.println(ConsoleTextColour.ANSI_YELLOW.getColour()+"MULTIPLE CONDITIONS"+ConsoleTextColour.ANSI_RESET.getColour());
        List<Person> multiplePredicates = filter(personList,
                adult.
                and(p-> p.getName().toLowerCase().contains("u")).
                and(Person::isMale)
        );

        multiplePredicates.forEach(System.out::println);

    }

    static List<Person> createPersonList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(34,"Nacho","11111111"));
        personList.add(new Person(43,"Juan","11111111"));
        personList.add(new Person(26,"Vladimir","11111111"));
        personList.add(new Person(34,"Luisa","11111111",false));
        return personList;
    }

    static List<Person> filter(List<Person> personList,Predicate<Person> predicate){
        List<Person> result = new ArrayList<>();
        for(Person p : personList){
            if(predicate.test(p)){
                result.add(p);
            }
        }
        return result;
    }
}
