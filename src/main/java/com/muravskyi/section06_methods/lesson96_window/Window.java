package com.muravskyi.section06_methods.lesson96_window;

public class Window {

    private int width;
    private int height;
    private boolean isVisible;
    private int top;
    private int left;

    public int getWidth() {
        return width;
    }

    public Window setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Window setHeight(int height) {
        this.height = height;
        return this;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public Window setVisible(boolean visible) {
        isVisible = visible;
        return this;
    }

    public int getTop() {
        return top;
    }

    public Window setTop(int top) {
        this.top = top;
        return this;
    }

    public int getLeft() {
        return left;
    }

    public Window setLeft(int left) {
        this.left = left;
        return this;
    }
}
