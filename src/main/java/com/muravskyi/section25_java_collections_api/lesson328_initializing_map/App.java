package com.muravskyi.section25_java_collections_api.lesson328_initializing_map;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Integer, String> months = new HashMap<>(Map.ofEntries(
                Map.entry(1, "January"),
                Map.entry(2, "February"),
                Map.entry(3, "March"),
                Map.entry(4, "April"),
                Map.entry(5, "May"),
                Map.entry(6, "June"),
                Map.entry(7, "July"),
                Map.entry(8, "August"),
                Map.entry(9, "September"),
                Map.entry(10, "October"),
                Map.entry(11, "November"),
                Map.entry(12, "December")
        ));

        months.forEach((integer, s) -> System.out.println(integer + " : " + s));

        System.out.println();

        for (Map.Entry<Integer, String> month : months.entrySet()) {
            var monthKey = month.getKey();
            var monthValue = month.getValue();
            System.out.println(monthKey + " : " + monthValue);
        }

    }

}
