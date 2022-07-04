package com.muravskyi.section08_booleans_and_conditions.lesson116_boolean_and;

public class App {

    public static void main(String[] args) {
        // ==   , !=, !, &&, ||

        boolean isRaining = false;
        boolean mightRain = true;

        boolean takeUmbrella = isRaining || mightRain;

        System.out.println(takeUmbrella);

    }

}