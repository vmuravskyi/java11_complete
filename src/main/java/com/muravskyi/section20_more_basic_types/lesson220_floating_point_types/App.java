package com.muravskyi.section20_more_basic_types.lesson220_floating_point_types;

public class App {

    public static void main(String[] args) {

        float floatValue  = 23.70f;
        double doubleValue = 12345.89d;

        System.out.printf("Float contains %d bytes; min: %f, max: %f\n", Float.SIZE / 8, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double contains %d bytes; min: %f, max: %f\n", Double.SIZE / 8, Double.MIN_VALUE, Double.MAX_VALUE);

    }

}
