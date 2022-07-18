package com.muravskyi.section25_java_collections_api.lesson296_variable_argument;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        new App().run(4, "hello", "how", "are", "you");

        List<String> list = List.of("hello", "how", "are", "you");

    }

    public void run(int value, String... text) {
    	System.out.println(value);
        System.out.println(Arrays.toString(text));
    }

}
