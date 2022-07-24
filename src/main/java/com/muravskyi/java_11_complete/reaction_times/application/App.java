package com.muravskyi.java_11_complete.reaction_times.application;

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		
		// Create a "Controller" in a Swing thread.
		SwingUtilities.invokeLater(Controller::new);
	}
}
