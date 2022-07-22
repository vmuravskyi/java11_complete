package com.muravskyi.section25_java_collections_api.lesson326_hashmap;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        HashMap<Integer, String> people = new HashMap<>();
        people.put(0, "Mary");
        people.put(1, "Mary");
        people.put(3, "Joe");
        people.put(4, "Fred");
        people.put(4, "Zoltan");
        people.put(10, "Sue");

        String joe = people.get(3);
        System.out.println(joe);

        for (Map.Entry<Integer, String> person : people.entrySet()) {
            System.out.println(person.getKey() + " : " + person.getValue());
        }

    }

}
