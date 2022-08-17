package com.cydeo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Accessing the constants
        Currency c = Currency.DIME;

        System.out.println(c);
        System.out.println(Currency.PENNY.name());

        //Getting all constants

        Currency[] currencies = Currency.values();
        System.out.println(Arrays.toString(currencies));

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        //Using enum in swith
        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("It it 1 cent");
                break;
            case NICKLE:
                System.out.println("It it 5 cent");
                break;
            case DIME:
                System.out.println("It it 10 cent");
                break;
            case QUARTER:
                System.out.println("It it 25 cent");
                break;

        }
    }
}
