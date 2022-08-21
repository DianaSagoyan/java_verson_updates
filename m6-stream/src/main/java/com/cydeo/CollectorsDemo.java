package com.cydeo;


import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        //toCollection(Supplier) : is used to create a collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        System.out.println("-----------------------------------");

        //toList():returns a Collector interface that gathers the input data into a List
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("-----------------------------------");

        //toSet():returns a Collector interface that gathers the input data into a Set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 ==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("-----------------------------------");

        //toMap(Function, Function): returns a Collector interface that gathers the input data into a map
        Map<String, Integer> dishCal = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishCal);

        System.out.println("-----------------------------------");

        //summingInt(toIntFunction): returns a Collector interface that produces the sum of the integer value function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("-----------------------------------");

        //counting(): returns a Collector interface that counts the number of elements
         long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);
    }
}
