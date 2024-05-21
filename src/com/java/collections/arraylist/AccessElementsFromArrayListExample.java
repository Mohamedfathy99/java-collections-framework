package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Real Madrid");
        elements.add("Barcelona");
        elements.add("Juventus");
        elements.add("Milan");

        System.out.println("Is elements list empty? \n"+ elements.isEmpty());

        System.out.println("How many elements in list ? \n"+ elements.size());

        // retrieve elements at a given index
        System.out.println("Get element " + elements.indexOf("Barcelona") + " is: "+ elements.get(1));

        System.out.println("Get element " + elements.indexOf("Real Madrid") + " is: "+ elements.get(0));

        // retrieve elements at a last index
        System.out.println("The last elements in list is => " + elements.getLast());

        // Modify the element at given index
        elements.set(3, "Arsenal");

        System.out.println("The elements of list => " + elements);
    }
}
