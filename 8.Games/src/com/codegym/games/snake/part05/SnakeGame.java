package com.codegym.games.snake.part05;

import com.codegym.engine.cell.*;
import com.codegym.engine.cell.Color;


public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        drawScene();
        Apple apple = new Apple(7, 7);
        apple.draw(this);
    }

    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellColor(i, j, Color.DARKSEAGREEN);
            }
        }
    }
}
