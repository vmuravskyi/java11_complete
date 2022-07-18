package com.muravskyi.section25_java_collections_api.lesson295_static_methods_in_interfaces;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> list = List.of(5, 7, 9);
        System.out.println(list.getClass());

        Test.run();

    }

}
