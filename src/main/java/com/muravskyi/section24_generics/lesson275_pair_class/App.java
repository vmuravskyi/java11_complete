package com.muravskyi.section24_generics.lesson275_pair_class;

import com.muravskyi.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;

public class App {

    public static void main(String[] args) {

        Pair<Integer, Cat> pair = new Pair<>(5, new Cat("Joe"));

        System.out.println(pair);

    }

}
