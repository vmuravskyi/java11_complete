package com.muravskyi.section25_java_collections_api.lesson303_concurrent_modification_exception;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        //list.clear();

        int index = 0;
        for (var n : list) {
            list.remove(n);
        }

    }

}
