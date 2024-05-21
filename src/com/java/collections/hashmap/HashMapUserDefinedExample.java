package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {

    public static void main(String[] args) {

        // create hashmap

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, new Student("Mohamed", "Fathy"));
        studentMap.put(2, new Student("Yousef", "Fathy"));
        studentMap.put(3, new Student("Amr", "Fathy"));
        studentMap.put(4, new Student("Ahmed", "Fathy"));

        System.out.println(studentMap.values());
    }
}
