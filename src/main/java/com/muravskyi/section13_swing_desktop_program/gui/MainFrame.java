package com.muravskyi.section13_swing_desktop_program.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());
        add(new Toolbar(), BorderLayout.NORTH);
        this.add(new MainPanel(), BorderLayout.CENTER);

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}