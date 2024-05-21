package com.java.collections.arraylist;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();
        List<String> programmingCourses = Arrays.asList("C++", "C#", "Java", "Python", "Javascript", "Hibernate");

        courses.add("Arabic");
        courses.add("English");
        courses.add("French");
        courses.add("Germany");

//        System.out.println("Elements of courses list => " + courses);
//        System.out.println("Elements of programming courses list => " + programmingCourses);

        // basic for loop for iterating elements
        for (int i = 0; i < programmingCourses.size(); i++) {
            System.out.println("Elements of programming courses list => " + programmingCourses.get(i));
        }

        System.out.println("--------------------------------------");
        // enhanced for each loop
        for(String course: courses){
            System.out.println("Elements of programming courses list => " + course);
        }

        System.out.println("--------------------------------------");
        // basic loop with iterator
        for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println("--------------------------------------");
        // iterator with while loop
        Iterator iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println("--------------------------------------");
        // using java 8 stream + lambda example
        courses.stream().forEach(course -> System.out.println(course));

        System.out.println("--------------------------------------");
        // using java 8 stream + lambda example
        courses.forEach((course) -> System.out.println(course));


    }
}
