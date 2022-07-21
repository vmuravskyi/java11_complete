package com.muravskyi.section25_java_collections_api.lesson316_union_and_intersection;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        var fruits1 = new HashSet<>(Set.of("apple", "banana", "cherry", "pear"));
        var fruits2 = new HashSet<>(Set.of("raspberry", "apple", "blackberry", "cherry"));

        var union = new HashSet<String>(fruits1);
        union.addAll(fruits2);

        union.forEach(System.out::println);

        System.out.println();

        var intersection = new HashSet<String>(fruits1);
        intersection.retainAll(fruits2);
        intersection.forEach(System.out::println);

        System.out.println();

        // find only fruit which are present in fruits1 and are not present in fruits2
        var onlyInFruits1 = new HashSet<>(fruits1);
        onlyInFruits1.removeAll(fruits2);
        onlyInFruits1.forEach(System.out::println);


    }

}
