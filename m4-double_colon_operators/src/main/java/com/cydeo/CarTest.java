package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        //Zero argument constructor
        Supplier<Car> c1 = () -> new Car();

        Supplier<Car> c2 = Car::new;

        //One argument constructor
        Function<Integer, Car> c3 = model -> new Car(model);

        Function<Integer, Car> c4 = Car::new;

        //Two argument constructor
        BiFunction<String, Integer, Car> c5 = Car::new;
        Car merc = c5.apply("Mercedes", 2016);
        System.out.println("Model: " + merc.getModel() + " Make: " + merc.getMake());
    }
}
