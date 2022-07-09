package com.muravskyi.section17_swing_handling_button_clicks_with_inner_classes.gui;

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