package com.muravskyi.section25_java_collections_api.lesson309_implementing_iterable;

import java.util.Iterator;

public class Ring<E> implements Iterable<E> {

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

    @Override
    public Iterator<E> iterator() {
        return new RingIterator();
    }

    private class RingIterator implements Iterator<E> {

        private int readPosition = 0;
        private int itemsRead = 0;

        public RingIterator() {
            if (numberOfItems == items.length) {
                readPosition = writePosition;
            }
        }

        @Override
        public boolean hasNext() {
            return itemsRead < numberOfItems;
        }

        @Override
        public E next() {
            ++itemsRead;
            if (readPosition == items.length) {
                readPosition = 0;
            }
            return items[readPosition++];
        }

    }

}
