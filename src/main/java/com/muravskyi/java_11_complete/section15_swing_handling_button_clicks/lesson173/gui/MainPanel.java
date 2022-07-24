package com.muravskyi.java_11_complete.section15_swing_handling_button_clicks.lesson173.gui;

import java.awt.Color;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ColorChangeListener {

	private static final long serialVersionUID = 8097138259120111059L;

	public MainPanel() {
        this.setBackground(Color.green);
    }
	
	@Override
	public void changeColor(Color color) {
		this.setBackground(color);
	}

}