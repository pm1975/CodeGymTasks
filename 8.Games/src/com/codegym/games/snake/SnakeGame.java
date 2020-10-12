package com.codegym.games.snake;

import com.codegym.engine.cell.*;
import com.codegym.engine.cell.Color;

import java.awt.*;

/**
 * Created by Piotr on 2020-10-03
 */
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
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x,y,Color.DARKSEAGREEN);
            }
        }
    }
}
