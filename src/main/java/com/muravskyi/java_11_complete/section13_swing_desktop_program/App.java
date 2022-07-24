package com.muravskyi.java_11_complete.section13_swing_desktop_program;

import com.muravskyi.java_11_complete.section13_swing_desktop_program.gui.MainFrame;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new MainFrame("Test Swing App");
        });
    }

}