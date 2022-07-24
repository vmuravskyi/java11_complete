package com.muravskyi.java_11_complete.section25_java_collections_api.lesson291_arraylist_exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> userNumbers = new ArrayList<>();
        String userInput;
        System.out.println("Please enter a number. When you want to stop, please enter 'stop'");
        do {
            userInput = scanner.nextLine();
            if (verifyInput(userInput)) {
                userNumbers.add(Double.parseDouble(userInput));
            } else if (!userInput.equalsIgnoreCase("stop")) {
                System.out.println("You entered a wrong symbol, please, enter a number or 'stop' to quit");
            }
        } while (!userInput.equals("stop"));

        userNumbers.sort(Double::compareTo);
        System.out.println("User input: " + userNumbers);

        var average = userNumbers.stream()
            .reduce(Double::sum)
            .map(aDouble -> aDouble / userNumbers.size());

        if (average.isEmpty()) {
            System.out.println("No values have been entered");
        } else {
            System.out.printf("Average: %.2f", average.get());
        }

    }

    public static boolean verifyInput(String input) {
        Pattern pattern1 = Pattern.compile("(\\d+)?\\.(\\d+)?");
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        return matcher1.matches() || matcher2.matches();
    }

}
