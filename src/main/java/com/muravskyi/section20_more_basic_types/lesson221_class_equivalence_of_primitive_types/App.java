package com.muravskyi.section20_more_basic_types.lesson221_class_equivalence_of_primitive_types;

public class App {

    public static void main(String[] args) {

        Integer intValue1 = 127;
        Integer intValue2 = 127;

        System.out.println(intValue1 == intValue2); // true

        Integer intValue3 = 128;
        Integer intValue4 = 128;

        System.out.println(intValue3 == intValue4); // false

    }

}