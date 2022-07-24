package com.muravskyi.java_11_complete.section13_swing_desktop_program.gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

    public Toolbar() {
        this.add(new JButton("One"));
        this.add(new JButton("Two"));
    }

}
