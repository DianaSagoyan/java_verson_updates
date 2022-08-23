package com.cydeo.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        numbersList.add(7);

        List<Integer> unmodifiableList = List.copyOf(numbersList);
        System.out.println(unmodifiableList);
    }
}
