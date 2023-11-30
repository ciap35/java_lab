package com.java.laboratory.practices.structures.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args){
        //String[] friendsArray = new String[]; //Will trhow an compile error, size must be defined
        String[] friendsArray = new String[4];
        String[] friendsArray2 ={ "John","Matthew","Alexis"};
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John","Matthew","Alexis")); //Doing this we will get an inmutable list and will be unable to modify it


        //Getting an element from array
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        //Length vs Size
        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());


        //Arrays are inmutable, can't be modifed
        //Arrays can hold primitives or objects
        //ArrayList can only hold objects but support wrapper types for primitives such Arrays.asList
        //Bot are index zero
    }
}
