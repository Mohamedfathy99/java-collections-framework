package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

    public static void main(String[] args) {

        // example to map numbers to string
        Map<String, Integer> ages = new HashMap<>();

        // add key = value to map
        ages.put("Mohamed", 24);
        ages.put("Ahmed", 27);
        ages.put("Yousef", 15);
        ages.put("Amr", 8);
        ages.put(null, 6);

        System.out.println(ages);

        // check if hashmap is empty
        System.out.println(ages.isEmpty());

        // find the size of hashmap
        System.out.println("The size of hashmap "+ ages.size());

        // check if a key exists in the HashMap
        if (ages.containsKey("Mohamed")) {
            System.out.println("The value of the key = "+ ages.get("Mohamed"));
        } else {
            System.out.println("This key not found in map");
        }

        // check if a value exists in the HashMap
        if (ages.containsValue(24)) {
            System.out.println("Exist");
        } else {
            System.out.println("This value not found in map");
        }

        // how to remove keys from hashmap
        System.out.println(ages.remove("Yousef"));
        System.out.println(ages);

        // get only keys from hashmap
        System.out.println(ages.keySet());

        // get only values from hashmap
        System.out.println(ages.values());
        System.out.println("==============================================");
        // different ways to iterate over hashmap

        // for each method

        for (Map.Entry<String, Integer> age: ages.entrySet()){
            System.out.println("Key => "+ age.getKey() + " value " + age.getValue());
        }
        System.out.println("=============================");
        // using iterator
        Set<Map.Entry<String, Integer>> entries = ages.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> age = iterator.next();
            System.out.println("Key => "+ age.getKey() + " value " + age.getValue());
        }

        // hashmap using java 8 forEach
        ages.forEach((key, value) -> {
            System.out.println("Key " + key);
            System.out.println("Value " + value);
        });


    }
}
