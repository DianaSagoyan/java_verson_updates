package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to a static method
        Calculate s2 = Calculator::findSum;
        s2.calculate(4, 5);

        //reference to instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        s3.calculate(2, 3);

        Calculate s4 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;
        System.out.println(func2.apply("something", 1));

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;
        display2.accept(4);
    }
}
