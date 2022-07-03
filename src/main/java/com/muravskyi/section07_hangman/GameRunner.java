package com.muravskyi.section07_hangman;

public class GameRunner {
	
	private Hangman hangman;
	
	public void run() {
		hangman = new Hangman();
		while (hangman.run()) {
			repeat();
		}
		System.out.println("\nBye!");
	}
	
	public void repeat() {
		hangman = new Hangman();
		hangman.run();
	}
	
	public void close() {
		hangman.close();
	}

}