package com.muravskyi.section16_inner_classes.lesson183_local_inner_class;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

    private String name;

    public App() {
        name = "Elizabeth";
    }

    public static void main(String[] args) {

        new App().run();

    }

    private void run() {

        class Printer implements Runnable {

            public void print() {
                System.out.println(App.this.name);
            }

            @Override
            public void run() {
                print();
            }

        }

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new Printer(), 0L, 1L, TimeUnit.SECONDS);

    }

}
