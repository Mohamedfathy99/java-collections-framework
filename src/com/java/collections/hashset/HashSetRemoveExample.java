package com.java.collections.hashset;


import java.util.HashSet;
import java.util.Set;

// remove() method - Remove an element from a HashSet
// removeAll() method - Remove all the elements that exists in a given collection from HashSet
// clear() method - Clear the HashSet completely by removing all the elements
public class HashSetRemoveExample {

    public static void main(String[] args) {

        // creating HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(-3);

        // using remove() method
//        System.out.println(numbers.remove(3));
//        System.out.println(numbers);

        // using removeAll() method
        Set<Integer> evenNumbers = new HashSet<>();

        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

        System.out.println(numbers.removeAll(evenNumbers));
        System.out.println(numbers);

        // clear method
        numbers.clear();
        System.out.println("Number Set after clear => " + numbers);
    }
}
