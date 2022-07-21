package com.muravskyi.section32_bitwise_operators.lesson406_numbering_system;

public class App {

    public static void main(String[] args) {

        /*
         * 0-9 decimal
         * 0-1 binary
         * 0-F hexadecimal
         *
         */

        int value = 123;

        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toHexString(value));


        int value255 = 0xFF;
        System.out.println(value255);

    }

}
