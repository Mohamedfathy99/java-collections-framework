package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> nameCollection = new ArrayList<>();
        nameCollection.add("Mohamed");
        nameCollection.add("Amr");
        nameCollection.add("Yousef");

        System.out.println("< Before remove element >");

        for (String name: nameCollection){
            System.out.println("name is: " + name);
        }
        System.out.println("----------------------------------------");
        nameCollection.remove("Amr");

        System.out.println("< After remove element >");

        for (String name: nameCollection){
            System.out.println("name is: " + name);
        }
        System.out.println("----------------------------------------");

        nameCollection.forEach((element) ->{
            System.out.println(element);
        });
        System.out.println("----------------------------------------");

        nameCollection.clear();
        System.out.println("if the name collection is empty? \n" + nameCollection.isEmpty());
        System.out.println("the name collection output \n" + nameCollection);

//        System.out.println("Is name found in collection ? \n"+ nameCollection.contains("Mohamed"));
//        System.out.println("Is name collection empty ? \n" + nameCollection.isEmpty());
//
//        System.out.println("name collection Class \n" + nameCollection.getClass());


    }
}
