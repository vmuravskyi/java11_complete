package com.muravskyi.java_11_complete.section25_java_collections_api.lesson318_linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("apple");
        fruits.add("pear");
        fruits.add("cherry");
        fruits.add("banana");

        for (var f : fruits) {
            System.out.println(f);
        }

    }

}
