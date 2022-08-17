package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        swap(a, 0, 2);
        System.out.println(Arrays.toString(a));
    }

    private static <T> void swap(T[]a, int x, int y){
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
