package com.muravskyi.section06_methods.lesson86_menu_example;

public class Menu {

    private final String[] options = {"View database", "Add new item", "Delete item", "Quit program"};

    public Menu() {
    	// default
    }

    public void display() {
    	System.out.println("Choose your option:");
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d. %s\n", i + 1, options[i]);
        }
    }

}