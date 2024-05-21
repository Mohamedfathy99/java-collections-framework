package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {

        List<String> teams = new ArrayList<>();

        teams.add("Real Madrid");
        teams.add("Barcelona");
        teams.add("Juventus");
        teams.add("Arsenal");
        teams.add("Chelsea");

        System.out.println("Elements of teams list ==> " + teams);
        // want to
        // remove()
        // removeAll()
        // clear()
        System.out.println("elements was removed from list ==> " + teams.remove(1) +
                "\nThe other elements in list ==> " + teams);

        System.out.println("Is element remove from list? => " + teams.remove("Arsenal") +
                "\nThe other elements in list ==> " + teams);

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println("Elements of fruit list " + fruits);

        fruits.removeAll(fruits);
        System.out.println("Fruit list after remove elements " + fruits);

        fruits.clear();
        System.out.println("Fruit list after clear elements " + fruits);
    }
}
