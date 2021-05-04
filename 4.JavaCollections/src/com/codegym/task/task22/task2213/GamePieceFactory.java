package com.codegym.task.task22.task2213;

public class GamePieceFactory {
    public static GamePiece createRandomGamePiece(int x, int y) {
        return new GamePiece(x, y, new int[x][y]);
    }
}
