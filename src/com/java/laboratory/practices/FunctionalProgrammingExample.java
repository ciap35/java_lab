package com.java.laboratory.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.java.laboratory.practices.MessageFormatExample.printHeader;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        predicateExample();
        mapReduce();
        peek();
        startsWith();
    }

    public static void predicateExample(){
        printHeader("predicateExample");
        // Inmutable List
        // List series = List.of("Family Guy","Big Bang Theory","The simpsons");
        List series = new ArrayList();
        series.add("Family Guy");
        series.add("Big Bang Theory");
        series.add("The simpsons");
        series.removeIf(s->s.equals("Big Bang Theory"));

        System.out.println(series);
    }

    public static void mapReduce(){
        printHeader("mapReduce");
        // It will let us to operate with inmutable object.
        // It will work with a separated list.
         List series = List.of("Family Guy","Big Bang Theory","The simpsons");
         var filteredSeries = series.stream()
                 .filter(s-> !s.equals("Big Bang Theory")) //Map
                 .map(j -> j.toString().toUpperCase()) //Map
                 .collect(Collectors.toList()); //Reduce

        System.out.println("Series: "+series);
        System.out.println("Filtered series: "+filteredSeries);

    }

    public static void peek(){
        printHeader("peek");
        // It will let us to operate with inmutable object.
        // It will work with a separated list.
        List series = List.of("Family Guy","Big Bang Theory","The simpsons");
        var filteredSeries = series.stream()
                .filter(s-> !s.equals("Big Bang Theory")) //Map
                .peek(System.out::println) //Audit or print output
                .map(j -> j.toString().toUpperCase()) //Map
                .peek(System.out::println) //Audit or print output
                .collect(Collectors.toList()); //Reduce

        System.out.println("Series: "+series);
        System.out.println("Filtered series: "+filteredSeries);

    }

    public static void startsWith(){
        printHeader("streamAndStartWith");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .map(s-> s.concat(" * RESULT *"))
                .sorted()
                .forEach(System.out::println);
    }


}
