package com.java.laboratory.practices.functionalProgramming.Streams;

import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Person> personList;
    public static void main(String[] args) {
        // Create personList
        personList = createPersonList();
        filter(personList);
        map(personList);
        filterAndMapAgeAndName(personList);
        sortedByAgeAsc(personList);
        sortedByAgeDesc(personList);
        sortedByAge(personList,true);
        sortedByAge(personList,false);
        sortedByAge_v2(personList,true);
        sortedByAge_v2(personList,false);

        /*Using Comparators*/
        Comparator<Person> comparatorByAge = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Comparator<Person> comparatorByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        sortedByPassingComparator(personList,comparatorByAge);
        sortedByPassingComparator(personList,comparatorByName);

        /*Streams*/
        limit(personList);
        skip(personList);
        distinct(personList);
        mapToInt(personList);
        mapToDouble(personList);

        /*Final operations*/
        collect(personList);
        joining(personList);
        findAny(personList);
        reduce(personList);
        min(personList);
        max(personList);
        average(personList);

    }


    /**
     * Creates a list of Person objects.
     *
     * @return a list of Person objects
     */
    static List<Person> createPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(18, "Nacho", "1111111"));
        personList.add(new Person(18, "Nacho", "1111111"));
        personList.add(new Person(20, "Pedro", "1111111"));
        personList.add(new Person(14, "Vladimir", "1111111"));
        personList.add(new Person(17, "Luisa", "1111111", false));
        personList.add(new Person(28, "Melissa", "1111111", false));
        return personList;
    }

    static void  filter(List<Person> personList){
        System.out.println("Main.filter");
        System.out.println("==============================");
        personList
                .stream()
                .filter(p->p.getAge()>18)
                .filter(p->!p.isMale())
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void  map(List<Person> personList){
        System.out.println("Main.map");
        System.out.println("==============================");
        personList
                .stream()
                .map(p->"Name: "+ p.getName()+ " - Age: "+p.getAge())
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void  filterAndMapAgeAndName(List<Person> personList){
        System.out.println("Main.filterAndMapAgeAndName");
        System.out.println("==============================");
        personList
                .stream()
                .filter(p-> p.getAge()>18)
                .map(p->{
                  String name = p.getName().toUpperCase();
                  String age = String.valueOf(p.getAge());
                    return "Name: "+ name.toUpperCase()+ " - Age: "+age;
                })
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void sortedByAgeAsc(List<Person> personList) {
        System.out.println("Main.sorted ASC");
        System.out.println("==============================");
        personList.stream()
                .sorted((p1,p2)-> p1.getAge()-p2.getAge())
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void sortedByAgeDesc(List<Person> personList) {
        System.out.println("Main.sorted DESC");
        System.out.println("==============================");
        personList.stream()
                .sorted((p1,p2)-> p2.getAge()-p1.getAge())
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void sortedByAge(List<Person> personList,boolean asc) {
        System.out.println("Main.sorted "+ (asc ? "ASC" : "DESC"));
        System.out.println("==============================");
        personList.stream()
                .sorted((p1,p2)-> asc ? p1.getAge()-p2.getAge() : p2.getAge()-p1.getAge())
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }


    static void sortedByAge_v2(List<Person> personList,boolean asc) {
        System.out.println("Main.sortedByAge_v2 "+ (asc ? "ASC" : "DESC"));
        System.out.println("==============================");
        personList.stream()
                .sorted((p1,p2)-> asc ? Integer.compare(p1.getAge(),p2.getAge()) : Integer.compare(p2.getAge(),p1.getAge()))
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void sortedByPassingComparator(List<Person> personList,Comparator<Person> comparator) {
        System.out.println("Main.sortedByPassingComparator ");
        System.out.println("==============================");
        personList.stream()
                .sorted(comparator)
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }


    static void limit(List<Person> personList){
        System.out.println("Main.limit");
        System.out.println("==============================");

        personList.stream()
                .limit(5) //return first 5
                .forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }

    static void skip(List<Person> personList){
        System.out.println("Main.skip");
        System.out.println("==============================");

        personList.stream()
                .skip(2) //discard first 2
                .forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }


    static void distinct(List<Person> personList){
        System.out.println("Main.distinct");
        System.out.println("==============================");
        personList.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println();
    }

    static void mapToInt(List<Person> personList){
        System.out.println("Main.mapToInt");
        System.out.println("==============================");

        personList.stream()
                .mapToInt(x-> Integer.parseInt(x.getDocument()))
                .forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }



    static void mapToDouble(List<Person> personList){
        System.out.println("Main.mapToDouble");
        System.out.println("==============================");

        personList.stream()
                .mapToDouble(x-> Double.parseDouble(x.getDocument()))
                .forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }

    /*Final operations*/
    static void collect(List<Person> personList){
        System.out.println("Main.collect");
        System.out.println("==============================");

        List<Person> adults =  personList.stream()
                .filter(p-> p.getAge() >= 18)
                //.collect(Collectors.toList());
                .toList(); //IS EQUIVALENT

        for(Person p : adults){
            System.out.println(p);
        }

        System.out.println("==============================");
        System.out.println();
    }

    static void joining(List<Person> personList){
        System.out.println("Main.joining");
        System.out.println("==============================");

        String nameList =  personList.stream()
                .filter(p-> p.getAge() >= 18)
                //.collect(Collectors.toList());
                .map(p->p.getName())
                .collect(Collectors.joining(",","[ "," ]")); //IS EQUIVALENT

        System.out.println("nameList = " + nameList);
        System.out.println("==============================");
        System.out.println();
    }

    /*Reducciones predefinidas*/
    static void findAny(List<Person> personList){
        System.out.println("Main.findAny");
        System.out.println("==============================");

        Optional<String> randomName =  personList.stream()
                .filter(p-> p.getAge() >= 18)
                .map(Person::getName)
                .findAny(); //IS EQUIVALENT

        System.out.println("nameList = " + randomName.get());
        System.out.println("==============================");
        System.out.println();
    }

    static void reduce(List<Person> personList){
        System.out.println("Main.reduce");
        System.out.println("==============================");

        int sumAges =  personList.stream()
                .mapToInt(p-> p.getAge())
                .reduce(0,(e1,e2) -> e1+e2); //first parameter: InitialCounter

        System.out.println("total of ages = " + sumAges);

        if(personList.stream().anyMatch(p-> p.getAge() >=18)){
            System.out.println("There almost one adult in the list");
        }


        System.out.println("==============================");
        System.out.println();
    }

    static void min(List<Person> personList){
        System.out.println("Main.min");
        System.out.println("==============================");

        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);
        if(randomNumber<=0.5){
            personList = Collections.emptyList();//Force clean the list and call the else condition below.
        }

        Optional<Person> youngestPerson =  personList.stream()
                .min((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()));



        if(youngestPerson.isPresent()){
            System.out.println("Youngest Person: "+ youngestPerson.get());
        }else{
            System.out.println("There no young people on the list: ");
        }

        System.out.println("==============================");
        System.out.println();
    }

    static void max(List<Person> personList){
        System.out.println("Main.max");
        System.out.println("==============================");

        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);
        if(randomNumber<=0.5){
            personList = Collections.emptyList();//Force clean the list and call the else condition below.
        }

        Optional<Person> oldestPerson =  personList.stream()
                .max((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()));



        if(oldestPerson.isPresent()){
            System.out.println("Oldest Person: "+ oldestPerson.get());
        }else{
            System.out.println("There no young people on the list: ");
        }

        System.out.println("==============================");
        System.out.println();
    }


    static void average(List<Person> personList){
        System.out.println("Main.average");
        System.out.println("==============================");


        /*OptionalDouble averageAge = personList.stream()
                .filter(p->p.getAge()>=18)
                .mapToInt(Person::getAge)
                .average();*/

        OptionalDouble averageAge = personList.stream()
                .mapToInt(Person::getAge)
                .average();

        if(averageAge.isPresent()){
            System.out.println("average age = " + averageAge.getAsDouble());
        }


        System.out.println("==============================");
        System.out.println();
    }

}
