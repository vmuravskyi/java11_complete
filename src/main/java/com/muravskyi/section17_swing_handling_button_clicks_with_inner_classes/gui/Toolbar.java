package com.muravskyi.section17_swing_handling_button_clicks_with_inner_classes.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

    private static final long serialVersionUID = 8994407518816263657L;
    private ColorChangeListener colorChanger;

    public Toolbar() {

        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        redButton.addActionListener(actionListener -> colorChanger.changeColor(Color.RED));
        blueButton.addActionListener(actionListener -> colorChanger.changeColor(Color.BLUE));

        this.add(redButton);
        this.add(blueButton);
    }

    public Toolbar setColorChanger(ColorChangeListener colorChanger) {
        this.colorChanger = colorChanger;
        return this;
    }



}