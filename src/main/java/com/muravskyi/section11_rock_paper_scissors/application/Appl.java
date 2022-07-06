package com.muravskyi.section11_rock_paper_scissors.application;

import java.util.stream.IntStream;

public class Appl {

    public static void main(String[] args) {

        var count = IntStream.range(1, 200)
                .filter(value -> zadachka(value) == false)
                .count();
        System.out.println("Count is " + count);

    }

    public static boolean zadachka(int x) {
        int four = 4;
        int two = 2;
        int one = 1;
        int temp;
        if (x % 2 != 0) {
            temp = (3 * x) + 1;
        } else {
            temp = x / 2;
        }
        System.out.println(x);
        if (temp >= 4) {
            System.out.println(temp != four || temp != two || temp != one);
            zadachka(temp);
        } else if (temp == 2) {
            System.out.println(temp != two || temp != one);
            zadachka(temp);
        } else if (temp == 1) {
            System.out.println(temp != one);
            return temp != one;
        }
        return true;
    }

}
