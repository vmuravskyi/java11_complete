package com.muravskyi.section21_conways_game_of_life;

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