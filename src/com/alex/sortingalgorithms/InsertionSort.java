package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {30, 11, 3, 2, 5, 33};

        insertionSort(array);

        AlgoHelper.printArray(array);
    }

    private static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int elementToInsert = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > elementToInsert; i--) {
                array[i] = array[i - 1];
            }
            array[i] = elementToInsert;
        }
    }
}
