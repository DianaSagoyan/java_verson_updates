package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> even = i -> i % 2 == 0;
        Predicate<Integer> odd = Predicate.not(even); //i -> i % 2 != 0

        List<Integer> evenNumbers = list.stream()
                .filter(even)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
