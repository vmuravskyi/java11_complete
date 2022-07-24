package com.muravskyi.java_11_complete.section20_more_basic_types.lesson222_widening_narrowing_conversions;

public class App {

    public static void main(String[] args) {

        int intValue1 = 8;

        long longValue1 = intValue1;

        System.out.println(longValue1);

        long longValue2 = 1234554645;
//        long longValue2 = 123455464523423; wouldn't work as too long for int

        int intValue2 = (int) longValue2;

        System.out.println(intValue2);

        int intValue3 = 23;
        byte byteValue3 = (byte) intValue3;

        System.out.println(byteValue3);

    }

}