package com.muravskyi.java_11_complete.section26_midi;

import java.util.HashSet;

public class Chord extends HashSet<Integer> {

    public enum Type {
        MAJOR,
        MINOR,
        SUS4,
        SEVENTH
    }

    public Chord(int root, Type type) {
        add(root);
        add(root + 7);

        switch (type) {
            case MAJOR:
                add(root + 4);
            case MINOR:
                add(root + 3);
            case SUS4:
                add(root + 5);
        }

    }

}
