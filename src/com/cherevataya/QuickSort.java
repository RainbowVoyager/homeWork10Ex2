package com.cherevataya;

class QuickSort {
    private int input[];
    private int length;

    public void sort(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        int middleIndex = input[low + (high - low) / 2];
        while (i <= j) {
            while (input[i] < middleIndex) {
                i++;
            }
            while (input[j] > middleIndex) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
