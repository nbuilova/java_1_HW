package lesson8_homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleField extends JPanel {
    private GameWindow gameWindow;
    private int size;
    private int winningLength;
    private boolean isInit;
    private int cellWidth;
    private int cellHeight;

    public BattleField(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.LIGHT_GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;
                if (!Logic.gameFinished) {
                    Logic.humanTurn(cellX, cellY);
                } else {
                    showWinner();
                }
            }
        });
    }

    void startNewGame(int size, int winningLength) {
        this.size = size;
        this.winningLength = winningLength;
        isInit = true;
        repaint();
    }

    public void showWinner() {
        if (Logic.result == 0) {
            JOptionPane.showMessageDialog(null, "Ничья", "Ничья", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Logic.result == 1) {
            JOptionPane.showMessageDialog(null, "Поздравляем! Вы выиграли!", "Победа", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Logic.result == 2) {
            JOptionPane.showMessageDialog(null, "Копьютер победил", "Поражение", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }

        cellWidth = getWidth() / size;
        cellHeight = getHeight() / size;

        g.setColor(Color.DARK_GRAY);
        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        for (int i = 1; i < size; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 1; i < size; i++) {
            int x = i * cellHeight;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                }
            }
        }
        repaint();
    }

    private void drawX(Graphics g, int cellX, int cellY) {
        g.setColor(Color.GREEN);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        g.drawLine(cellX * cellWidth, cellY * cellHeight,
                cellX * cellWidth + cellWidth, cellY * cellHeight + cellHeight);
        g.drawLine(cellX * cellWidth + cellWidth, cellY * cellHeight,
                cellX * cellWidth, cellY * cellHeight + cellHeight);
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        g.setColor(Color.MAGENTA);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        g.drawOval(cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight);
    }
}
