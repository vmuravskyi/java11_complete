package com.muravskyi.java_11_complete.section33_cellular_automata.test;

import com.muravskyi.java_11_complete.section33_cellular_automata.controller.Rule;

public class Test {

    public static void main(String[] args) {

        Rule rule = new Rule(90);

        System.out.println(rule.toString());

        for (int i = 7; i >= 0; i--) {
            System.out.print(rule.get(i));
        }

    }

}
