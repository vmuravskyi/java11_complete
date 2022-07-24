package com.muravskyi.java_11_complete.section36_recursion;

public class lesson426_factorial {

    public static void main(String[] args) {

        // !0 = 1
        // !1 = 1
        // !2 = 2 x 1
        // !3 = 3 x 2 x 1
        // !4 = 4 x 3 x 2 x 1

        System.out.println(factorial(5));
        System.out.println(recurse(5));

    }

    private static int recurse(int value) {
        if (value == 0) {
            return 1;
        }
        return value * recurse(value - 1);
    }

    public static int factorial(int input) {
        if (input == 0) {
            return 1;
        }

        int result = input;
        for (int i = input - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }

}
