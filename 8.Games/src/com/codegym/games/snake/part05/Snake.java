package com.codegym.games.snake.part05;

import com.codegym.games.snake.GameObject;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<com.codegym.games.snake.GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        snakeParts.add(new com.codegym.games.snake.GameObject(x, y));
        snakeParts.add(new com.codegym.games.snake.GameObject(x + 1, y + 1));
        snakeParts.add(new GameObject(x + 2, y + 2));
    }
}
