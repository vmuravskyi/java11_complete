package com.muravskyi.section07_hangman;

import java.util.Random;

public class RandomWord {

//	private final String[] words = {"father", "family", "infant", "tongue", "nothing", "longer", "explicit", "call",
//		"authority", "blacksmith", "likeness", "photograph", "regarding", "inscription", "sister", "mother", "shape",
//		"childish", "pocket", "conclusion", "memory"};
	
	private final String[] words = {"один", "відомий", "сучасність", "письменник", "діалог", "автор", "гострий", "рейтинг",
		"популярність", "сорт", "бажання", "каталог", "книга", "мільйон", "моторошний", "сюжет", "проза",
		"жанр", "людина", "порок", "постановка"};

	private final String chosenWord;
	private final Random random = new Random();
	private char[] characters;

	public RandomWord() {
		chosenWord = words[random.nextInt(words.length - 1)];
		characters = new char[chosenWord.length()];
		System.out.println("The word has been generated");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (char c : characters) {
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' ');
		}
		return sb.toString();
	}

	public boolean addGuess(char userGuess) {
		// fill in c in character array wherever it's found in random word
		boolean isCorrect = false;
		char[] charArray = chosenWord.toCharArray();
		int index = 0;
		for (char c : charArray) {
			if (c == userGuess) {
				characters[index] = c;
				isCorrect = true;
			}
			index++;
		}
		return isCorrect;
	}

	public boolean isComplete() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}
	
	public String getWord() {
		return chosenWord;
	}

}