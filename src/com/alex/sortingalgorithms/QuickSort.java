package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = {3, 6, 4, 5};
        quickSort(input, 0, input.length);
        AlgoHelper.printArray(input);
    }

    private static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) return;
        int partitionIndex = partition(input, start, end);

        quickSort(input, start, partitionIndex);
        quickSort(input, partitionIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //empty loop
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
