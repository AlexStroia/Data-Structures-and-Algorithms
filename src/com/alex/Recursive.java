package com.alex;

public class Recursive {

    public static void main(String[] args) {
        System.out.println("Write three function to calculate factorial");
        System.out.println("1. One without recursion");
        System.out.println("2. One with recursion from Top to bottom");

        System.out.println(factorial(3));
        System.out.println(factorialTopToBottom(3));
        System.out.println(factorialBottomToTop(3));
    }

    private static int factorial(int num) {
        if (num == 0) return 1;
        int factorial = 0;
        for (int i = 1; i <= num; i++) {
            factorial += i;
        }
        return factorial;
    }

    private static int factorialTopToBottom(int n) {
        if (n == 0) return 1;

        return n * factorialTopToBottom(n - 1);
    }

    private static int factorialBottomToTop(int n) {
        if (n == 0) return 1;

        int factorial = 1;
        int multiplier = 1;

        while (multiplier <= n) {
            factorial = multiplier * factorial;
            multiplier++;
        }

        return factorial;
    }
}
