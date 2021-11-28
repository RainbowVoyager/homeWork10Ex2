package com.cherevataya;
/*
2*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой.
Можно найти готовую реализацию и разобраться или написать свою
 */

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));
        QuickSort algorithm = new QuickSort();
        algorithm.sort(unsorted);
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
    }
}