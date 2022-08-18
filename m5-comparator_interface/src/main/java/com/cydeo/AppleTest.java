package com.cydeo;


import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

//        Comparator<Apple> sortApple = Comparator.comparing(Apple::getWeight);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
    }
}