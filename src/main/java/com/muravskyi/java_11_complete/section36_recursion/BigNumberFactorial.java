package com.muravskyi.java_11_complete.section36_recursion;

import java.math.BigInteger;

public class BigNumberFactorial {

    public static void main(String[] args) {

        // !5

        //        System.out.println("Using loop: " + factorial(500));
        System.out.println("Using recursion: " + recurse(1_000_000));

    }

    private static BigInteger recurse(long value) {
        BigInteger converted = new BigInteger(String.valueOf(value));
        if (converted.equals(new BigInteger(String.valueOf(0)))) {
            return new BigInteger(String.valueOf(1));
        }
        return converted.multiply(recurse(value - 1));
    }

    public static BigInteger factorial(long input) {

        BigInteger converted = new BigInteger(String.valueOf(input));
        if (converted.equals(new BigInteger(String.valueOf(0)))) {
            return new BigInteger(String.valueOf(1));
        }

        BigInteger result = converted;
        for (long i = input - 1; i > 0; i--) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }

}
