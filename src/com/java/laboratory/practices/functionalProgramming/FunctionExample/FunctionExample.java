package com.java.laboratory.practices.functionalProgramming.FunctionExample;

import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Create personList
        List<Person> personList = createPersonList();

        // Create function to generate a comma-separated list of names
        Function<List<Person>, String> nameListFunction = createNameListFunction();

        // Apply the function to the personList and print the result
        System.out.println(nameListFunction.apply(personList));
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
     * Creates a Function that generates a comma-separated list of names from a list of Person objects.
     *
     * @return a Function that takes a list of Person objects and returns a comma-separated list of their names
     */
    static Function<List<Person>, String> createNameListFunction() {
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
    }


}