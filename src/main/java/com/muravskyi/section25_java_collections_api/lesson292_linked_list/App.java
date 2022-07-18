package com.muravskyi.section25_java_collections_api.lesson292_linked_list;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> texts = new LinkedList<>();

        texts.add("dog");
        texts.add("cat");
        texts.add("rat");

        for (String s : texts) {
            System.out.println(s);
        }




    }

}
