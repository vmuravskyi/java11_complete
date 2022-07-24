package com.muravskyi.java_11_complete.section15_swing_handling_button_clicks.lesson173.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public MainFrame(String title) {
        super(title);
        
        final MainPanel mainPanel = new MainPanel();
        
        //mainPanel.changeColor(Color.DARK_GRAY);

        this.setLayout(new BorderLayout());
        this.add(new Toolbar(mainPanel), BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}