package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElementExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(-8);
        System.out.println("The retrieval element is: "+ linkedList.get(2));
        System.out.println("The retrieval element is: "+ linkedList.getLast());

        for (Integer element: linkedList){
            System.out.println(element);
        }

    }
}
