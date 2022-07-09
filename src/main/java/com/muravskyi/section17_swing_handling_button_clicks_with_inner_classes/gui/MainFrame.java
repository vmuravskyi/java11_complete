package com.muravskyi.section17_swing_handling_button_clicks_with_inner_classes.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public MainFrame(String title) {
        super(title);
        
        final MainPanel mainPanel = new MainPanel();

        final Toolbar toolbar = new Toolbar();
        toolbar.setColorChanger(mainPanel);

        this.setLayout(new BorderLayout());
        this.add(toolbar, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}