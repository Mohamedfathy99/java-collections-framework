package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemovingElementFromLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(-10);

        System.out.println("Elements of Linked List=> "+ linkedList);

        linkedList.removeFirst();
        System.out.println("Elements of Linked List after remove first element => "+ linkedList);

        linkedList.clear();

        System.out.println("LinkedList after clear elements: " + linkedList);
    }
}
