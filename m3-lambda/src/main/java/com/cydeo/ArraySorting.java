package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        qs.sort();
        bs.sort();
    }

    private static void sort(Sorting sorting){
        sorting.sort();
    }
}
