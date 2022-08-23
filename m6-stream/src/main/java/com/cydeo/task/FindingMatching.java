package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {
        //ALL MATCH
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("--------------------------------------");

        //ANY MATCH
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("--------------------------------------");

        //NONE MATCH
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("--------------------------------------");

        //FIND ANY
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        System.out.println("--------------------------------------");

        //FIND FIRST
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);
        System.out.println(dish2.get());

        System.out.println("--------------------------------------");

        //FIND FIRST
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        System.out.println("--------------------------------------");

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        System.out.println("--------------------------------------");

        //MIN AND MAX
        Optional<Dish> dMin = DishData.getAll().stream()
                .min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin);

        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);

        System.out.println("--------------------------------------");

//        int calories = DishData.getAll().stream()
//                .map(Dish::getCalories)
//                .reduce( (a, b) -> a + b).get();

        Optional<Integer> calories = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce( (a, b) -> a + b);
                .reduce(Integer::sum);
        System.out.println(calories.get());

        System.out.println("--------------------------------------");


        //Max and Min
        List<Integer> numbers = Arrays.asList(4, 5, 9, 3);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
        System.out.println("Sum:" + sum);

        System.out.println("--------------------------------------");

        //COUNT
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);

    }
}
