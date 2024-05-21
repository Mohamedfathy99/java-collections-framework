package com.java.collections.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ShortList {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Mmohamed", 30, 30000));
        employees.add(new Employee(11, "Amr", 28, 10000));
        employees.add(new Employee(12, "Abdo", 27, 20000));
        employees.add(new Employee(13, "Khaled", 25, 25000));


        Collections.sort(employees, new Comparator<Employee>(){

            @Override
            public int compare(Employee emp1, Employee emp2){
                return (int) (emp2.getSalary() - emp1.getSalary());
            }
        });
        System.out.println(employees);
//        // ascending order
////        Collections.sort(employees, new MySort());
////        System.out.println(employees);
//
//        // descending order
//        Collections.sort(employees, new MySort());
//        System.out.println(employees);

    }
}
class MySort implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2){
        return (int) (emp2.getSalary() - emp1.getSalary());
    }
}
