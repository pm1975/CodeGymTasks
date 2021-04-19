package com.codegym.task.task35.task3513;

public class MoveFitness {
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveFitness(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }
}
