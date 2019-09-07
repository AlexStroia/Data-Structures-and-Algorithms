package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class CountSort {

    public static void main(String[] args) {
        int[] array = {4, 3, 2};

        countingSort(array, 2, 4);
        AlgoHelper.printArray(array);

    }

    private static void countingSort(int[] input, int min, int max) {
        int[] countingArray = new int[max - min + 1];

        for (int i = 0; i < input.length; i++) {
            countingArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            //Check if the value stored in the counting array is greater than 0
            while (countingArray[i - min] > 0) {
                input[j] = i;
                j++;
                countingArray[i - min]--;
            }
        }
    }
}
