package com.muravskyi.section25_java_collections_api.lesson307_ring_buffer_exercise;

public class Ring<E> {

    private E[] items;
    private int writePosition;
    private int numberOfItems = 0;


    @SuppressWarnings("unchecked")
    public Ring(int size) {
        items = (E[]) new Object[size];
    }

    public void add(E element) {
        items[writePosition++] = element;

        if (writePosition == items.length) {
            writePosition = 0;
        }

        if (++numberOfItems > items.length) {
            numberOfItems = items.length;
        }
    }

    public E get(int index) {
        return items[index];
    }

    public int size() {
        return numberOfItems;
    }

}
