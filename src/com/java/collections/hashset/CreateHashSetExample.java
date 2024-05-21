package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

    public static void main(String[] args) {

        // add new elements to it using the add() method
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C++");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Javascript");

        System.out.println("The elements on the set are: " + programmingLanguages);

        // C++ element will add one time only | let's add a duplicate element to set
        programmingLanguages.add("C++");

        System.out.println("The elements on the set are: " + programmingLanguages);

    }
}
