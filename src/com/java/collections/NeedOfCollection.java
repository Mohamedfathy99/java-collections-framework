package com.java.collections;

public class NeedOfCollection {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        int e = 30;
        int f = 30;
        int g = 30;
        int h = 30;

        int[] arArray = new int[10000];
        // limitations of an array
        // 1. Arrays are fixed in size
        // 2. Arrays hold a homogeneous (elements in similar type), can't store different data type in an array
        // 3. ready made APIs support does not available in array
        // for this reason we have to use collections framework
        Student [] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book();
    }
}

class Student{

}

class Book{

}
