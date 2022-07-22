package com.muravskyi.section25_java_collections_api.lesson334_maps_of_lists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Integer, List<String>> societies = new HashMap<>();

        societies.put(0, new LinkedList<>(List.of("WH", "JH", "IU")));
        societies.put(1, new LinkedList<>(List.of("TY", "LK", "FG")));

        for (Map.Entry<Integer, List<String>> society : societies.entrySet()) {
            Integer key = society.getKey();
            List<String> people = society.getValue();
            System.out.println("\nKey: " + key);
            for (String person : people) {
                System.out.print(person + " ");
            }
            System.out.println();
        }

    }

}
