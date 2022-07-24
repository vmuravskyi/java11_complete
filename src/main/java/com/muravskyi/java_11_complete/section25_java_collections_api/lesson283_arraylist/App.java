package com.muravskyi.java_11_complete.section25_java_collections_api.lesson283_arraylist;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(123);

        for (var i : list) {
            System.out.println(i);
        }

    }

}
