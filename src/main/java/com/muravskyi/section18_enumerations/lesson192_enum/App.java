package com.muravskyi.section18_enumerations.lesson192_enum;

public class App {

    public static void main(String[] args) {

        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }

    }

}