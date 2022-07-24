package com.muravskyi.java_11_complete.section25_java_collections_api.lesson336_collections_and_inheritance;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

class SkillSet extends LinkedHashSet<String> {


}

public class App {

    public static void main(String[] args) {

        Map<Integer, SkillSet> map = new HashMap<>();

        SkillSet skills1 = new SkillSet();
        skills1.add("programming");
        skills1.add("teaching");

        SkillSet skills2 = new SkillSet();
        skills2.add("jumping");
        skills2.add("flying");

        map.put(0, skills1);
        map.put(1, skills2);

        for (Map.Entry<Integer, SkillSet> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
