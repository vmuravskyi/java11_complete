package com.muravskyi.java_11_complete.section21_conways_game_of_life.gui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final static int CELL_SIZE = 50;
    private final static Color backGroundColor = Color.BLACK;
    private final static Color foreGroundColor = Color.GREEN;
    private final static Color gridColor = Color.GRAY;

    private int topBottomMargin;
    private int leftRightMargin;

    public GamePanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELL_SIZE) + CELL_SIZE) / 2;
        topBottomMargin = ((height % CELL_SIZE) + CELL_SIZE) / 2;

        g2.setColor(backGroundColor);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);

        fillCell(g2, 2, 4, true);
        fillCell(g2, 2, 4, false);
        fillCell(g2, 3, 5, true);
        fillCell(g2, 3, 5, false);
        fillCell(g2, 1, 1, true);
    }

    private void fillCell(Graphics2D g2, int row, int col, boolean status) {
        Color color = status ? foreGroundColor : backGroundColor;
        g2.setColor(color);

        int x = leftRightMargin + col * CELL_SIZE;
        int y = topBottomMargin + row * CELL_SIZE;

        g2.fillRect(x + 1, y + 1, CELL_SIZE - 2, CELL_SIZE - 2);
    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        g2.setColor(gridColor);

        for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELL_SIZE) {
            g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
        }

        for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELL_SIZE) {
            g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
        }

    }

}