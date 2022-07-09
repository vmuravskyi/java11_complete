package com.muravskyi.section16_inner_classes.lesson188_anonymous_class;

public class App {

    private String name = "Jojo";

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {
        activate(new Runnable() {
            @Override
            public void run() {
                System.out.println(App.this.name);
            }
        });
    }

    public void activate(Runnable runnable) {
        runnable.run();
    }

}
