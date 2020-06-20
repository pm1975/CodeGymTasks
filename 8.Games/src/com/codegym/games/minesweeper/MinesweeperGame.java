package com.codegym.games.minesweeper;

import com.codegym.engine.cell.*;
import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.SimpleTimeZone;

/**
 * Created by Piotr on 2020-06-19
 */
public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    private void createGame() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                boolean mine = getRandomNumber(10) == 9;
                if (mine) countMinesOnField++;
                gameField[i][j] = new GameObject(j, i, mine);
                setCellColor(i, j, Color.ORANGE);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void setScreenSize(int width, int height) {
        super.setScreenSize(width, height);
    }
}
