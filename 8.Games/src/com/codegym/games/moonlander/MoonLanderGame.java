package com.codegym.games.moonlander;

import com.codegym.engine.cell.*;
import com.codegym.engine.cell.Color;

import java.awt.*;

/**
 * Created by Piotr on 2020-10-06
 */
public class MoonLanderGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

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
                setCellColor(x,y, Color.BLACK);
            }
        }
    }
}
