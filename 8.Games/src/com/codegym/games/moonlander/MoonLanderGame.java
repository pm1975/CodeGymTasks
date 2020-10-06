package com.codegym.games.moonlander;

import com.codegym.engine.cell.*;

/**
 * Created by Piotr on 2020-10-06
 */
public class MoonLanderGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
    }
}
