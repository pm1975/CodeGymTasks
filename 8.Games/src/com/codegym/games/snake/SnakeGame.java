package com.codegym.games.snake;

import com.codegym.engine.cell.*;

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
    }
}
