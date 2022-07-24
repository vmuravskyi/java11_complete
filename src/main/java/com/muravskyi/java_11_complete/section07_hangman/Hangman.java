package com.muravskyi.java_11_complete.section07_hangman;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hangman {

	private boolean running = true;
	private boolean isRepeatGame = true;
	private final RandomWord word = new RandomWord();
	private final Scanner scanner = new Scanner(System.in);
	private int triesRemaining = 10;
	private char lastGuess;

	public boolean run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);
		isRepeatGame();
		return isRepeatGame;
	}

	private void isRepeatGame() {
		boolean isChoiceMade = false;
		String choice;
		do {
			System.out.println("\nDo you want to play again? y/n");
			choice = scanner.nextLine();

			switch (choice) {
			case "y":
				isChoiceMade = true;
				break;
			case "n":
				isRepeatGame = false;
				isChoiceMade = true;
				break;
			}
		} while (!isChoiceMade);
	}

	void displayWord() {
		System.out.println("Tries remaining " + triesRemaining);
		System.out.println(word);
	}

	void getUserInput() {
		// ask a user to enter a character
		// get the character as a string
		// pass the character to randomWord as the argument to a method
		System.out.println("Enter your guess > ");
		String guess;
		do {
			guess = scanner.nextLine();
		} while (!isUserInputVerified(guess));
		lastGuess = guess.charAt(0);
	}

	private boolean isUserInputVerified(String guess) {
		boolean isVerified = true;
		String inputRegex = "\\p{L}+";
		Pattern pattern = Pattern.compile(inputRegex);
		Matcher matcher = pattern.matcher(guess);
		if (!matcher.matches() || guess.isBlank() || guess.isEmpty()) {
			System.out.println("You have entered incorrect input, please enter a small alphabetic letter");
			isVerified = false;
		}
		return isVerified;
	}

	void checkUserInput() {
		boolean isGuessCorrect = word.addGuess(lastGuess);
		if (isGuessCorrect) {
			if (word.isComplete()) {
				System.out.print("\n\nYou have won!");
				System.out.printf("\nThe word is: [%s]", word.toString().replaceAll(" ", ""));
				running = false;
			}
		} else {
			triesRemaining--;
			if (triesRemaining == 0) {
				System.out.println("\nYou have lost");
				System.out.printf("The word was [%s]", word.getWord());
				running = false;
			}

		}

	}

	public void close() {
		scanner.close();
	}

}