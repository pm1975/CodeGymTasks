package com.codegym.games.game2048;

import com.codegym.engine.cell.*;

/**
 * Created by Piotr on 2020-10-03
 */
public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {

    }
}
