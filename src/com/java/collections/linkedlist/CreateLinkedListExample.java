package com.java.collections.linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Mango");
        System.out.println("Initial LinkedList => " + linkedList);

        // adding an element at the specified position in the linkedlist
        linkedList.add(4,"Meat");
        linkedList.add(5, "Chicken");
        System.out.println("LinkedList => " + linkedList);

        // adding an element at the first or last position in the linkedlist
        linkedList.addFirst("Carrot");
        linkedList.addLast("Fish");
        System.out.println("LinkedList => " + linkedList);
        linkedList.add(0, "strawberry");
        System.out.println("LinkedList => " + linkedList);

        linkedList.remove("Carrot");
        System.out.println("LinkedList After remove carrot => " + linkedList);

    }
}
