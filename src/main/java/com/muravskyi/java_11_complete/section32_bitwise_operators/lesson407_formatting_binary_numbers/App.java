package com.muravskyi.java_11_complete.section32_bitwise_operators.lesson407_formatting_binary_numbers;

public class App {

    public static void main(String[] args) {

        int value = 0b0101011;
        System.out.println(toBinary(value));

    }

    public static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
    }

}
