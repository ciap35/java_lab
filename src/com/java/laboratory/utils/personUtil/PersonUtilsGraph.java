package com.java.laboratory.utils.personUtil;

import dto.character.Person;

import java.util.*;

public class PersonUtilsGraph {

    private Map<Person, List<Person>> adjVertices;

public PersonUtilsGraph() {
    adjVertices = new HashMap<>();
}

void addVertex(Person person) {
    adjVertices.putIfAbsent(person, new ArrayList<>());
}

void addEdge(Person person1, Person person2) {
    adjVertices.get(person1).add(person2);
    adjVertices.get(person2).add(person1); // Assuming undirected graph
}

List<Person> getAdjVertices(Person person) {
    return adjVertices.get(person);
}

public static void main(String[] args) {
    PersonUtilsGraph graph = new PersonUtilsGraph();

    Person p1 = new Person("John", "Doe", 'M');
    Person p2 = new Person("Jane", "Smith", 'F');
    Person p3 = new Person("Carlos", "Aguilera", 'M');
    Person p4 = new Person("Maria", "Garcia", 'F');
    Person p5 = new Person("Pedro", "Martinez", 'M');
    Person p6 = new Person("Luisa", "Fernandez", 'F');
    Person p7 = new Person("Javier", "Lopez", 'M');
    Person p8 = new Person("Isabella", "Gomez", 'F');
    Person p9 = new Person("Mateo", "Perez", 'M');
    Person p10 = new Person("Sofia", "Ramirez", 'F');

    graph.addVertex(p1);
    graph.addVertex(p2);
    graph.addVertex(p3);
    graph.addVertex(p4);
    graph.addVertex(p5);
    graph.addVertex(p6);
    graph.addVertex(p7);
    graph.addVertex(p8);
    graph.addVertex(p9);
    graph.addVertex(p10);

    graph.addEdge(p1, p2);
    graph.addEdge(p1, p3);
    graph.addEdge(p2, p4);
    graph.addEdge(p3, p5);
    graph.addEdge(p4, p6);
    graph.addEdge(p5, p7);
    graph.addEdge(p6, p8);
    graph.addEdge(p7, p9);
    graph.addEdge(p8, p10);

    for (Person person : graph.adjVertices.keySet()) {
        System.out.println("Person: " + person);
        System.out.println("Friends: " + graph.getAdjVertices(person));
    }
}
}
