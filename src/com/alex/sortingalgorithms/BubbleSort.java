package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {20, 35, 0, 11, 10, 3, -2};

        bubbleSort(array);
        AlgoHelper.printArray(array);
    }

    private static void bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
