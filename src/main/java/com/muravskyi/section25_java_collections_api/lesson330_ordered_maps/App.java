package com.muravskyi.section25_java_collections_api.lesson330_ordered_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        Map<Integer, String> months1 = new LinkedHashMap<>();

        months1.put(1, "Jan");
        months1.put(3, "Mar");
        months1.put(6, "Jun");

        months1.forEach((integer, s) -> System.out.println(integer + " : " + s));

        System.out.println();

        Map<Integer, String> months2 = new TreeMap<>();
        months2.put(3, "Mar");
        months2.put(6, "Jun");
        months2.put(1, "Jan");

        months2.forEach((integer, s) -> System.out.println(integer + " : " + s));

    }

}
