package com.muravskyi.java_11_complete.section33_cellular_automata.controller;

import com.muravskyi.java_11_complete.section33_cellular_automata.gui.ArtPanel;
import com.muravskyi.java_11_complete.section33_cellular_automata.gui.MainFrame;

public class Controller {

    private MainFrame mainFrame;
    private ArtPanel artPanel;

    public Controller() {
        artPanel = new ArtPanel(new Rule(22));
        mainFrame = new MainFrame();

        mainFrame.setContentPane(artPanel);
    }

}
