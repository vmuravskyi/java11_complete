package com.muravskyi.java_11_complete.section33_cellular_automata;

import com.muravskyi.java_11_complete.section33_cellular_automata.controller.Controller;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Controller::new);

    }

}
