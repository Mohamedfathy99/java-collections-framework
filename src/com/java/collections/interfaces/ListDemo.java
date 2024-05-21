package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // list allows us to add duplicate elements
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element1");
        System.out.println("Elements of list: " + list);
        System.out.println("----------------------------------------");

        for (String elementList: list){
            System.out.println("Element of list: " + elementList);
        }

        System.out.println("----------------------------------------");

        // list allows us to add null elements

        list.add(null);
        list.add(null);
        System.out.println("Elements of list: " + list);

        // insertion order as entered
        System.out.println("----------------------------------------");

        // access element of list
        System.out.println("get the element index: " + list.get(5));

    }
}
