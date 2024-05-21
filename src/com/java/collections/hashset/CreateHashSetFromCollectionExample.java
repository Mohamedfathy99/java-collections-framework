package com.java.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
    public static void main(String[] args) {

        // create Hashset from another collection using the hashset (collection c) constructor
        // Add all the elements from a collection to the Hashset using the addAll() method

        // first 5 even numbers
//        Set<Integer> firstFiveEvenNumbers = new HashSet<>();

        List<Integer> firstFiveEvenNumbers = new ArrayList<>();

        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

        Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);

        System.out.println(tenEvenNumbers);

//        Set<Integer> nextFiveEvenNumbers = new HashSet<>();
        List<Integer> nextFiveEvenNumbers = new ArrayList<>();

        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        tenEvenNumbers.addAll(nextFiveEvenNumbers);

        System.out.println(tenEvenNumbers);

    }
}
