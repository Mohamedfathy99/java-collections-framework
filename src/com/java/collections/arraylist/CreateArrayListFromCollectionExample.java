package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {

        // create arrayList object

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(10);
        firstFivePrimeNumbers.add(1);

        System.out.println("The first arrayList is: " + firstFivePrimeNumbers);
        System.out.println("------------------------------------");

        // First way to copy array list elements in another arraylist
        List<Integer> copyOfArrayList = new ArrayList<>();
        copyOfArrayList.addAll(firstFivePrimeNumbers);

        System.out.println("The copy of the first arrayList is: " + copyOfArrayList);

        System.out.println("------------------------------------");

        // Second way to copy array list elements in another arraylist
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println("The copy of the first arrayList is: " + firstTenPrimeNumbers);

    }
}
