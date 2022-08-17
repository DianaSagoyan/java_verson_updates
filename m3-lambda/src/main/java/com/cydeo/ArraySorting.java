package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

//        qs.sort();
//        bs.sort();

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

        as.sort(() -> System.out.println("Bubblr sort"));
    }

    private static void sort(Sorting sorting){
        sorting.sort();
    }
}
