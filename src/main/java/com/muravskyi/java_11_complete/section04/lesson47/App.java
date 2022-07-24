package com.muravskyi.java_11_complete.section04.lesson47;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        var input = random.nextBoolean();

        weatherAdviser(input);

    }

    private static void weatherAdviser(boolean isRaining) {
        if (isRaining) {
            System.out.println("It's raining, take an umbrella");
        } else {
            System.out.println("No need to take an umbrella");
        }
    }

}