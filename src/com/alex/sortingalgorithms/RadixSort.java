package com.alex.sortingalgorithms;

import com.alex.AlgoHelper;

public class RadixSort {

    public static void main(String[] args) {

        int[] input = {4725, 4586, 1330, 8792, 1594, 5722};

        radixSort(input, 4, 10);
        AlgoHelper.printArray(input);
    }

    private static void radixSort(int[] input, int width, int radix) {

        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        //copy to the current position all the elements that are before
        // for example J = 2 and in the counting array we have 0 1 2 this means that countingarray[2] = 3
        //this tells that on position 3 we have 3 elements that are 3 or less
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
