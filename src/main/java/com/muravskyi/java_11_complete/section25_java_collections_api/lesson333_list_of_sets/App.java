package com.muravskyi.java_11_complete.section25_java_collections_api.lesson333_list_of_sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<Set<String>> exerciseRota = new ArrayList<>();

        exerciseRota.add(new HashSet<>(Set.of("pushups", "pullups", "leg raises")));
        exerciseRota.add(new HashSet<>(Set.of("walking", "star jumps", "cycling")));

        for (Set<String> set : exerciseRota) {
            for (String s : set) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        Set<String> exercises = exerciseRota.get(0);

        for (String exercise : exercises) {
            System.out.println(exercise);
        }

    }

}
