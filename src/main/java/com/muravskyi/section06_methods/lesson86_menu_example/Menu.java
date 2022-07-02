package com.muravskyi.section06_methods.lesson86_menu_example;

public class Menu {

    private final String[] options;

    public Menu() {
        options = new String[4];
        options[0] = "View database";
        options[1] = "Add new item";
        options[2] = "Delete item";
        options[3] = "Quit program";
    }

    public void display() {
        for (int i = 0; i < options.length; i++) {
            String numberedOption = String.format("%d. %s", i + 1, options[i]);
            System.out.println(numberedOption);
        }
    }

}