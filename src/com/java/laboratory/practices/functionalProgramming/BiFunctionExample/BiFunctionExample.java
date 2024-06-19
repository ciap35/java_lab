package com.java.laboratory.practices.functionalProgramming.BiFunctionExample;

import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        // Create personList
        List<Person> personList = createPersonList();

        // Create BiFunction to filter persons by age
        BiFunction<List<Person>, Integer, List<Person>> ageFilterBiFunction = createAgeFilterBiFunction();

        // Create Function to generate a comma-separated list of names
        Function<List<Person>, String> nameListFunction = createNameListFunction();

        // Apply the age filter BiFunction to get persons aged 30 and above
        List<Person> adultsFiltered = ageFilterBiFunction.apply(personList, 30);

        // Print results
        System.out.println("People from 30 years old:");
        System.out.println(nameListFunction.apply(adultsFiltered));

        //Combining Functions.
        BiFunction<List<Person>,Integer, String> nameOfAdults = ageFilterBiFunction.andThen(nameListFunction);
        System.out.println("Name of Adult people over 18 years old: \n"+ nameOfAdults.apply(personList,18));
    }

    /**
     * Creates a list of Person objects.
     *
     * @return a list of Person objects
     */
    static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(34, "Nacho", "11111111"));
        personList.add(new Person(43, "Juan", "11111111"));
        personList.add(new Person(26, "Vladimir", "11111111"));
        personList.add(new Person(34, "Luisa", "11111111", false));
        return personList;
    }

    /**
     * Creates a BiFunction that filters a list of Person objects by age.
     *
     * @return a BiFunction that takes a list of Person objects and an age,
     *         and returns a list of Person objects who are older than or equal to the given age
     */
    static BiFunction<List<Person>, Integer, List<Person>> createAgeFilterBiFunction() {
        return new BiFunction<List<Person>, Integer, List<Person>>(){
            @Override
            public List<Person> apply(List<Person> personList, Integer age) {
                List<Person> result = new ArrayList<>();
                for (Person p : personList) {
                    if (p.getAge() >= age) {
                        result.add(p);
                    }
                }
                return result;
            }
        };
    }

    //Re factorized
    /*
    static BiFunction<List<Person>, Integer, List<Person>> createAgeFilterBiFunction() {
        return (list, age) -> {
            List<Person> result = new ArrayList<>();
            for (Person p : list) {
                if (p.getAge() >= age) {
                    result.add(p);
                }
            }
            return result;
        };
    }*/

    /**
     * Creates a Function that generates a comma-separated list of names from a list of Person objects.
     *
     * @return a Function that takes a list of Person objects and returns a comma-separated list of their names
     */
    static Function<List<Person>, String> createNameListFunction() {
        return new Function<List<Person>, String>(){
            @Override
            public String apply(List<Person> personList) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < personList.size(); i++) {
                    result.append(personList.get(i).getName());
                    if (i < personList.size() - 1) {
                        result.append(", ");
                    }
                }
                return result.toString();
            }
        };
    }

    //Re factorized
    /*static Function<List<Person>, String> createNameListFunction() {
        return list -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                result.append(list.get(i).getName());
                if (i < list.size() - 1) {
                    result.append(", ");
                }
            }
            return result.toString();
        };
    }*/
}
