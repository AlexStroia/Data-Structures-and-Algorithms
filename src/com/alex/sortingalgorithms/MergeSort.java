package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = {3, 6, 4, 5};
        mergeSort(input, 0, input.length);
    }

    private static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) return;

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input,start,mid,end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] < input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            System.out.println("Temp is: " + tempIndex);
            tempArray[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
            System.out.println("Called");
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);


        AlgoHelper.printArray(input);

    }
}
