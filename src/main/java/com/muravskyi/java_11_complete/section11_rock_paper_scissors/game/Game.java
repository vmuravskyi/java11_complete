package com.muravskyi.java_11_complete.section11_rock_paper_scissors.game;

import com.muravskyi.java_11_complete.section11_rock_paper_scissors.game.objects.Rock;
import com.muravskyi.java_11_complete.section11_rock_paper_scissors.game.objects.Scissors;
import com.muravskyi.java_11_complete.section11_rock_paper_scissors.game.objects.GameObject;
import com.muravskyi.java_11_complete.section11_rock_paper_scissors.game.objects.Paper;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {

    private static final String objectRegex = "[1-3]";
    private static final String countGamesRegex = "[1-9]";
    private static int wins = 0;
    private static int lost = 0;
    private static int draw = 0;
    private final GameObject[] gameObjects = {new Rock(), new Paper(), new Scissors()};
    private final String[] gameOutcomes = {"You lost", "Draw", "You won"};

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
            GameObject gameObject = gameObjects[random.nextInt(gameObjects.length)];

            System.out.println("Please, make your choice:");
            System.out.println("1: Rock");
            System.out.println("2: Paper");
            System.out.println("3: Scissors");
            System.out.println("> ");

            String input;
            do {
                input = scanner.nextLine();
            } while (isUserInputVerified(input, objectRegex));

            // get user game object from user's input - 1 (game objects array starts with 0)
            GameObject userGameObject = gameObjects[Integer.parseInt(input) - 1];


            System.out.println("You chose: " + userGameObject.toString());
            System.out.println("The computer chose: " + gameObject.toString());
            int result = userGameObject.compareTo(gameObject);

            // count number of wins & looses
            gameOutputCounter(result);

            System.out.println(gameOutcomes[result + 1]);
            countOfGames--;
        } while (countOfGames > 0);
        scorePrinter();
        scanner.close();
    }

    private boolean isUserInputVerified(String input, String regex) {
        boolean isVerified = false;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches() || !input.isBlank() || !input.isEmpty()) {
            isVerified = true;
        } else {
            System.out.println("Seems you have entered an incorrect value, please try again");
        }
        return !isVerified;
    }

    private void gameOutputCounter(int gameOutput) {
        if (gameOutput > 0) {
            wins++;
        } else if (gameOutput < 0) {
            lost++;
        } else {
            draw++;
        }
    }

    public void scorePrinter() {
        System.out.printf("\nWins: %d\nLooses: %d\nDraws: %d\nTotal games: %d",
                wins,
                lost,
                draw,
                wins + lost + draw);
    }

}