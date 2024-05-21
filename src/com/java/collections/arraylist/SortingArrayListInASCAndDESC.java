package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListInASCAndDESC {
    public static void main(String[] args) {

        // create list
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(11);
        list.add(7);
        list.add(-1);

        // ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.reverse(list);
        System.out.println(list);

    }
}
