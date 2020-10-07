package com.codegym.games.racer;

import com.codegym.engine.cell.*;

/**
 * Created by Piotr on 2020-10-07
 */
public class RacerGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
    }
}
