package com.muravskyi.java_11_complete.section25_java_collections_api.lesson307_ring_buffer_exercise;

public class App {

    public static void main(String[] args) {

        Ring<Integer> ring = new Ring<>(10);

        ring.add(1);
        ring.add(2);
        ring.add(3);
        ring.add(4);
        ring.add(5);
        ring.add(6);
        ring.add(7);
        ring.add(8);
        ring.add(9);
        ring.add(10);
        ring.add(11);
        ring.add(12);

        for (int i = 0; i < ring.size(); i++) {
            System.out.println(ring.get(i));
        }

    }

}
