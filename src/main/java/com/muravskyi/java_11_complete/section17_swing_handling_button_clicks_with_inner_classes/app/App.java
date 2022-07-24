package com.muravskyi.java_11_complete.section17_swing_handling_button_clicks_with_inner_classes.app;

import com.muravskyi.java_11_complete.section17_swing_handling_button_clicks_with_inner_classes.gui.MainFrame;
import javax.swing.SwingUtilities;

public class App {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
            new MainFrame("Test Swing App");
        });
		
	}

}