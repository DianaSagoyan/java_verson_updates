package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {
        //Creating unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
//        courses.add("TS");
        System.out.println(courses);


        System.out.println("-------------------------------------");
        //Creating unmodifiable List after Java9
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set after Java9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map after Java9
        Map<String, Integer> myCart = Map.ofEntries(
          Map.entry("Samsung TV", 1),
          Map.entry("PSP", 1),
          Map.entry("Chair", 5)
        );
    }
}
