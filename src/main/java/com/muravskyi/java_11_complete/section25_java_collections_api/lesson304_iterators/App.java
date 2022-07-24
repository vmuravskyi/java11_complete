package com.muravskyi.java_11_complete.section25_java_collections_api.lesson304_iterators;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));

        for (var it = numbers.listIterator(); it.hasNext(); ) {
            var number = it.next();

            if (number == 2) {
                it.remove();
            } else if (number == 3) {
                it.add(100);
            } else if (number == 1) {
                it.set(11);
            }

            System.out.println(number);
        }

        System.out.println();

        numbers.forEach(System.out::println);

    }

}
