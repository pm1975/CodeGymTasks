package com.codegym.games.minesweeper;

import com.codegym.engine.cell.*;

/**
 * Created by Piotr on 2020-06-19
 */
public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    
    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
    }

    @Override
    public void setScreenSize(int width, int height) {
        super.setScreenSize(width, height);
    }
}
