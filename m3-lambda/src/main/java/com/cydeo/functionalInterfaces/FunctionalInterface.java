package com.cydeo.functionalInterfaces;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        //PREDICATE
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(5));

        lesserThan = i -> i == 5;
        System.out.println(lesserThan.test(7));

        System.out.println("---------------------------------------");

        //CONSUMER
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(1);


        System.out.println("---------------------------------------");

        //BI CONSUMER
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(3, 7);


        System.out.println("---------------------------------------");

        //FUNCTION
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Diana"));


        System.out.println("---------------------------------------");

        //BI FUNCTION
        BiFunction<Integer, Integer, Integer> func = (x, y) -> x + y;
        System.out.println(func.apply(1, 7));


        System.out.println("---------------------------------------");

        //SUPPLIER
        Supplier<Double> random = () -> Math.random();
        System.out.println( random.get());
    }
}
