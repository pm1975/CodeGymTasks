package com.codegym.games.spaceinvaders;

import com.codegym.engine.cell.*;

import java.lang.reflect.WildcardType;

/**
 * Created by Piotr on 2020-10-08
 */
public class SpaceInvadersGame extends Game {
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
        drawField();
    }

    private void drawField() {

    }
}
