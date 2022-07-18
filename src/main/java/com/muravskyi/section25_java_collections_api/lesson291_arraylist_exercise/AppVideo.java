package com.muravskyi.section25_java_collections_api.lesson291_arraylist_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVideo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter a number or 'stop' to quit > ");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                double value = Double.parseDouble(input);
                numbers.add(value);
                System.out.println("Number added");
            } catch (NumberFormatException e) {
                System.err.println("Was not able to parse a double value");
                continue;
            }
        }
        scanner.close();

        numbers.sort(Double::compare);
        var average = numbers.stream()
            .reduce(Double::sum)
            .map(aDouble -> aDouble / numbers.size());

        System.out.println("You entered:");
        for (double d : numbers) {
            System.out.println(d);
        }
        System.out.printf("\nAverage value: %.2f", average.get());

    }

}
