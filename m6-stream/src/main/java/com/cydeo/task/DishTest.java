package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DishTest {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        List<Dish> dishes = DishData.getAll();
        dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        //Print the length of the name of each dish
        dishes.stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        //print three high caloric dish name, calorie > 300
        dishes.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted()
                .map(dish -> dish.getName())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        //Print all dish's name that are below 400 calories in sorted order
        dishes.stream()
                .filter(dish -> dish.getCalories() > 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
