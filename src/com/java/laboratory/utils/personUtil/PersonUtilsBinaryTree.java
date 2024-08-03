package com.java.laboratory.utils.personUtil;

import dto.character.Person;


public class PersonUtilsBinaryTree {

    static class Node {
        Person person;
        Node left, right;

        public Node(Person person) {
            this.person = person;
            left = right = null;
        }
    }

    Node root;

    public PersonUtilsBinaryTree() {
        root = null;
    }

    void insert(Person person) {
        root = insertRec(root, person);
    }

    Node insertRec(Node root, Person person) {
        if (root == null) {
            root = new Node(person);
            return root;
        }

        if (person.getName().compareTo(root.person.getName()) < 0)
            root.left = insertRec(root.left, person);
        else if (person.getName().compareTo(root.person.getName()) > 0)
            root.right = insertRec(root.right, person);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.person);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        PersonUtilsBinaryTree tree = new PersonUtilsBinaryTree();
        tree.insert(new Person("John", "Doe", 'M'));
        tree.insert(new Person("Jane", "Smith", 'F'));
        tree.insert(new Person("Carlos", "Aguilera", 'M'));
        tree.insert(new Person("Maria", "Garcia", 'F'));
        tree.insert(new Person("Pedro", "Martinez", 'M'));
        tree.insert(new Person("Luisa", "Fernandez", 'F'));
        tree.insert(new Person("Javier", "Lopez", 'M'));
        tree.insert(new Person("Isabella", "Gomez", 'F'));
        tree.insert(new Person("Mateo", "Perez", 'M'));
        tree.insert(new Person("Sofia", "Ramirez", 'F'));

        tree.inorder();
    }
}