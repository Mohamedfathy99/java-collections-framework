package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingAndSearchingForElementInLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("C++");
        linkedList.add("C#");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("Spring Boot");
        linkedList.add("Spring Framework");

        for (String element: linkedList){
            System.out.println("Programming Language = > " + element);
        }

        System.out.println(linkedList.contains("C"));

        // find the first element occurrence in linkedList

        System.out.println("The first element in Linked List is: " + linkedList.get(0));

        System.out.println("The index of Java in linked list is : " + linkedList.indexOf("Java"));

        // find the last element occurrence in linkedList
        System.out.println("The last element in the linked list is: " + linkedList.getLast());

        // iterator way
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }
        System.out.println("###########################");
        // foreach
// This code are the same
//        linkedList.forEach((element) -> System.out.println(element));

        linkedList.forEach((element) -> {
            System.out.println(element);
        });

        System.out.println("###########################");
        // for each advanced loop | enhanced for loop
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("###########################");
        // using simple for loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
