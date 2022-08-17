package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, com.cydeo.tasks.Color.GREEN));
        inventory.add(new Orange(100, com.cydeo.tasks.Color.RED));
        inventory.add(new Orange(200, com.cydeo.tasks.Color.GREEN));
        inventory.add(new Orange(50, com.cydeo.tasks.Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory, orangeLambda);

        OrangeFormatter fancyFormatter = orange -> {
           String ch = orange.getWeight() < 200 ? "light" : "heavy";
           return "A " + ch + " " + orange.getColor() + " Orange";
        };
        prettyPrintApple(inventory, fancyFormatter);
    }

    private static void prettyPrintApple(List<Orange>inventory, OrangeFormatter formatter){
        for(Orange orange: inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }
}
