package com.muravskyi.java_11_complete.section25_java_collections_api.lesson309_implementing_iterable;

public class App {

    public static void main(String[] args) {

        Ring<Integer> ring = new Ring<>(3);

        ring.add(1);
        ring.add(2);
        //ring.add(3);
        ring.add(4);
        ring.add(7);

        for (var it = ring.iterator(); it.hasNext(); ) {
                System.out.println(it.next());
        }

        System.out.println();

        // foreach
        for (var n : ring) {
            System.out.println(n);
        }

    }

}
