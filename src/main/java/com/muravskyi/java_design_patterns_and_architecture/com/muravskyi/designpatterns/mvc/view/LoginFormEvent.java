package com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.view;

public class LoginFormEvent {

    private String name;
    private String password;

    public LoginFormEvent(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
