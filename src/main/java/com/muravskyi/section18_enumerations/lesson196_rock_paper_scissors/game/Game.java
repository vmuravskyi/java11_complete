package com.muravskyi.section18_enumerations.lesson196_rock_paper_scissors.game;

import com.muravskyi.section18_enumerations.lesson196_rock_paper_scissors.game.objects.GameObject;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {

    private static final String objectRegex = "[1-3]";
    private static final String countGamesRegex = "[1-9]";
    private static int score = 0;
    private final GameObject[] gameObjects = GameObject.values();

    public void run() {
        System.out.println("Starting a new game...");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many games you would like to play? 1- 10");
        String inputCountOfGames;
        do {
            inputCountOfGames = scanner.nextLine();
        } while (isUserInputVerified(inputCountOfGames, countGamesRegex));

        // get the amount of game user wants to play
        int countOfGames = Integer.parseInt(inputCountOfGames);
        do {
            // get game object with random value from game objects array
            GameObject randomObject = gameObjects[random.nextInt(gameObjects.length)];

            System.out.println("\nPlease, make your choice:");
            System.out.println("1: Rock");
            System.out.println("2: Paper");
            System.out.println("3: Scissors");
            System.out.println("> ");

            String input;
            do {
                input = scanner.nextLine();
            } while (isUserInputVerified(input, objectRegex));

            // get user game object from user's input - 1 (game objects array starts with 0)
            GameObject playerObject = gameObjects[Integer.parseInt(input) - 1];

            System.out.println("You chose: " + playerObject.toString());
            System.out.println("The computer chose: " + randomObject.toString());
            boolean win = playerObject.beats(randomObject);

            // print compare result
            if (win) {
                System.out.println(playerObject + " beats " + randomObject);
                System.out.println("You win");
                ++score;
            } else if (playerObject == randomObject) {
                System.out.println("Draw");
            } else {
                System.out.println(randomObject + " beats " + playerObject);
                System.out.println("You loose");
                --score;
            }

            // count number of wins & looses
            countOfGames--;
        } while (countOfGames > 0);
        scorePrinter();
        scanner.close();
    }

    private boolean isUserInputVerified(String input, String regex) {
        boolean isVerified = false;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        try {
            if (!input.isBlank() && !input.isEmpty() && matcher.matches()) {
                isVerified = true;
            } else {
                throw new IllegalArgumentException("Seems you have entered an incorrect value, please try again");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return !isVerified;
    }


    public void scorePrinter() {
        System.out.printf("\nTotal score: %d\n", score);
        if (score > 0) {
            System.out.println("You won the game!");
        } else if (score < 0) {
            System.out.println("You lost the game!");
        } else {
            System.out.println("Draw!");
        }
    }

}