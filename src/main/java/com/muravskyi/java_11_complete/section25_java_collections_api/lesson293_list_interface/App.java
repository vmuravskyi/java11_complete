package com.muravskyi.java_11_complete.section25_java_collections_api.lesson293_list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> number = new LinkedList<>();

        number.add(5);
        number.add(8);
        number.add(9);

        displayList(number);

    }

    private static void displayList(List<Integer> list) {
        list.forEach(System.out::println);
    }

}
