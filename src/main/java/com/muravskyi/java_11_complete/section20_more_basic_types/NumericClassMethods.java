package com.muravskyi.java_11_complete.section20_more_basic_types;

public class NumericClassMethods {

    public static void main(String[] args) {

        String binString = String.format("%8s", Integer.toBinaryString(23)).replace(' ', '0');
        System.out.println(binString);

    }

}
