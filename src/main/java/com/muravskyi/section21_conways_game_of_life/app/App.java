package com.muravskyi.section21_conways_game_of_life.app;

import com.muravskyi.section21_conways_game_of_life.gui.MainFrame;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(MainFrame::new);

    }

}