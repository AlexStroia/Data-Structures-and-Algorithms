package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {20, 1, -15, 7, 35};

        selectionSort(array);

        AlgoHelper.printArray(array);
    }

    private static void selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestElementIndex = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largestElementIndex]) {
                    largestElementIndex = i;
                }
            }

            swap(array, largestElementIndex, lastUnsortedIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
