package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2);
//        list.forEach(System.out::println);

        //FILTER
        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //DISTINCT - only unique element
        list.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //TRUNCATE
        list.stream()
                .filter(x -> x % 2 ==0)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //SKIP
        list.stream()
                .filter(x -> x % 2 ==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //MAP
        list.stream()
                .filter(x -> x % 2 ==0)
                .map(x -> x * 2)
                .forEach(System.out::println);

        System.out.println("-------------------------");


    }
}
