package com.muravskyi.section18_enumerations.lesson195_enum_and_switch;

import com.muravskyi.section18_enumerations.lesson192_enum.Fruit;

public class App {

    public static void main(String[] args) {

        Fruit fruit = Fruit.APPLE;

        switch (fruit) {
            case APPLE:
                System.out.println("Apple chosen");
                break;
            case BANANA:
                System.out.println("BANANA chosen");
                break;
            case ORANGE:
                System.out.println("Orange chosen");
                break;
            default:
                break;
        }

    }

}