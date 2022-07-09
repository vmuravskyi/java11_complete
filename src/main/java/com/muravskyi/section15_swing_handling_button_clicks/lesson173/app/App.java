package com.muravskyi.section15_swing_handling_button_clicks.lesson173.app;

import javax.swing.SwingUtilities;

import com.muravskyi.section15_swing_handling_button_clicks.lesson173.gui.MainFrame;

public class App {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
            new MainFrame("Test Swing App");
        });
		
	}

}