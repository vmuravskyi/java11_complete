package com.muravskyi.java_11_complete.section16_inner_classes.lesson185_effectively_final;

public class App {

    private int count = 1;

    public static void main(String[] args) {

        new App().run();

    }

    private void run() {

        String name = "Peter";
//        name = "Volodymyr"; // not effectively final anymore

        class Test {
            public void print() {
                System.out.println(name);
                System.out.println(count);
            }
        }

        new Test().print();

    }

}
