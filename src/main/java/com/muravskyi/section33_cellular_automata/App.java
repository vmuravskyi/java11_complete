package com.muravskyi.section33_cellular_automata;

import com.muravskyi.section33_cellular_automata.controller.Controller;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Controller::new);

    }

}
