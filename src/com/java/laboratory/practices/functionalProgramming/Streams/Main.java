package com.java.laboratory.practices.functionalProgramming.Streams;

import com.java.laboratory.practices.functionalProgramming.dto.Person;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Person> personList;
    public static void main(String[] args) {
        // Create personList
        personList = createPersonList();
        arrayToList();
        toArray();
        mapToListUsingValues();
        mapToListUsingKeysAndValues();
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


        /*Working with Files*/
        workingWithFiles();

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

    /*Predefined reductions*/
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

    static void arrayToList(){
        System.out.println("Main.arrayToList");
        System.out.println("==============================");
        Person[] arrayPeople = new Person[6];
        arrayPeople[0] = new Person(18,"Charles","123456");
        arrayPeople[1] = new Person(18,"Nacho","123456");
        arrayPeople[2] = new Person(18,"Francisco","123456");
        arrayPeople[3] = new Person(18,"Carla","123456",true);
        arrayPeople[4] = new Person(18,"Melissa","123456",true);
        arrayPeople[5] = new Person(18,"Sonia","123456",true);

        List<Person> peopleList = Arrays.stream(arrayPeople).toList();
        peopleList.forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }

    static void toArray(){
        System.out.println("Main.toArray");
        System.out.println("==============================");
        Person[] arrayPeople = new Person[6];
        arrayPeople[0] = new Person(18,"Charles","123456");
        arrayPeople[1] = new Person(18,"Nacho","123456");
        arrayPeople[2] = new Person(18,"Francisco","123456");
        arrayPeople[3] = new Person(18,"Carla","123456",true);
        arrayPeople[4] = new Person(18,"Melissa","123456",true);
        arrayPeople[5] = new Person(18,"Sonia","123456",true);


        //Valid solution 1 declaring size of the new array
        //Person[] adults = Arrays.stream(arrayPeople).filter(p->p.getAge()>=18).toArray(arrSize -> new Person[arrSize]);
        //Valid solution 2 using lambda expression
        Person[] adults = Arrays.stream(arrayPeople).filter(p->p.getAge()>=18).toArray(Person[]::new);
        Arrays.stream(adults).forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();
    }

    static void mapToListUsingValues(){
        System.out.println("Main.mapToList");
        System.out.println("==============================");


        Map<String,Person> peopleMap = new HashMap<>();
        peopleMap.put("123456",new Person(18,"Charles","123456"));
        //HashMap doesn't allow duplicated entries
        /*peopleMap.put("123456",new Person(18,"Nacho","123456"));
        peopleMap.put("123456",new Person(18,"Francisco","123456"));
        peopleMap.put("123456",new Person(18,"Carla","123456",true));
        peopleMap.put("123456",new Person(18,"Melissa","123456",true));
        peopleMap.put("123456",new Person(18,"Sonia","123456",true));
*/
        peopleMap.put("223456",new Person(18,"Nacho","123456"));
        peopleMap.put("323456",new Person(18,"Francisco","123456"));
        peopleMap.put("423456",new Person(18,"Carla","123456",true));
        peopleMap.put("523456",new Person(18,"Melissa","123456",true));
        peopleMap.put("623456",new Person(18,"Sonia","123456",true));

        List<Person> peopleLst = peopleMap.values().stream().toList();
        peopleLst.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();


    }

    static void mapToListUsingKeysAndValues(){
        System.out.println("Main.mapToListUsingKeysAndValues");
        System.out.println("==============================");


        //HashMap doesn't allow duplicated entries
        //Order is not guaranteed
        Map<String,Person> peopleMap = new HashMap<>();
        peopleMap.put("123456",new Person(18,"Charles","123456"));
        peopleMap.put("223456",new Person(18,"Nacho","123456"));
        peopleMap.put("323456",new Person(18,"Francisco","123456"));
        peopleMap.put("423456",new Person(18,"Carla","123456",true));
        peopleMap.put("523456",new Person(18,"Melissa","123456",true));
        peopleMap.put("623456",new Person(18,"Sonia","123456",true));


        //Create a list of String only with Keys which represents the ID of each person.
        List<String> peopleLst = peopleMap
                .entrySet()
                .stream()
                .filter(p->p.getValue().getAge()>=18)
                .map(Map.Entry::getKey)
                .sorted(String::compareTo)
                //.collect(Collectors.toList());
                .toList();

        peopleLst.forEach(System.out::println);

        System.out.println("==============================");
        System.out.println();

    }

    static void workingWithFiles(){
        try{
            List<Person> peopleList = Files.lines(Paths.get("people.txt"))
                    .map(l-> new Person(
                            Integer.parseInt(l.split(":")[0]),
                            l.split(":")[1],
                            l.split(":")[2],
                            Boolean.valueOf(l.split(":")[3])
                            ))
                    .collect(Collectors.toList());
            System.out.println("People from file");
            peopleList.forEach(System.out::println);


            /*Generate
            *
            * */

            peopleList.add(new Person(generateRandomDocument(18,99),"Joe",String.valueOf(generateRandomDocument(100000,999999)),false));

            Files.write(Paths.get("people.txt"),
                    peopleList.stream()
                            .map(p->p.fileFormatting())
                            .collect(Collectors.toList())
            );

        }catch (Exception e){
            System.out.println("Error processing the file: "+e.getMessage());
        }
    }

    private static int generateRandomDocument(int min,int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }


}
