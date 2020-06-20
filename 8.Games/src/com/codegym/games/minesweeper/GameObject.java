package com.codegym.games.minesweeper;

import java.awt.*;

/**
 * Created by Piotr on 2020-06-19
 */
public class GameObject {
    public int x;
    public int y;
    public boolean isMine;

    public GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }

}
