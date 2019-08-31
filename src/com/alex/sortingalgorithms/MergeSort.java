package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = {3, 6, 4, 5};
        mergeSort(input, 0, input.length);
        AlgoHelper.printArray(input);
    }

    private static void mergeSort(int[] input, int start, int end) {
        //breaking condition from recursion
        //Means that we have only one element in array and if we have only one element in an array it means that element is sorted
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        //if the last element from the left array is less than the first element from the right array,
        // means that the elements are already sorted so we don't have to deal with them
        // we always merge sorted arrays
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int leftArrayIndex = start;
        int rightArrayIndex = mid;
        int tempArrayIndex = 0;

        int[] tempArray = new int[end - start];

        while (leftArrayIndex < mid && rightArrayIndex < end) {
            //we have work to do :)
            //if the element from the array on the left is less than the element on the right, copy it to the temp array and increment the index from where you copied
            tempArray[tempArrayIndex++] = input[leftArrayIndex] <= input[rightArrayIndex] ? input[leftArrayIndex++] : input[rightArrayIndex++];
        }

        //Copy any left over elements from the left array
        //We are leftover elements from the input array into the same array at the position where the temp index has remained
        //This means that the leftover element from the left array is greatear than all the elements that we currently have
        System.arraycopy(input, leftArrayIndex, input, start + tempArrayIndex, tempArrayIndex - mid);

        //Copy all the elements that have been added to the temp array, starting at the first position
        //Copy them into the input array and put them in the array at the position start to the temp array index position
        System.arraycopy(tempArray, 0, input, start, tempArrayIndex);
    }
}
