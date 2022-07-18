package com.muravskyi.section25_java_collections_api.lesson313_hashset;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("pear");

        for (var fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println(fruits.contains("grape"));
        System.out.println(fruits.contains("orange"));

    }

}
