package com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.controller;

import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.model.Model;
import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.view.LoginFormEvent;
import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.view.LoginListener;
import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.view.View;

public class Controller implements LoginListener {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
    }

}
