package com.codegym.games.minesweeper;

import com.codegym.engine.cell.Color;
import com.codegym.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private final GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void restart() {
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        score = 0;
        setScore(score);
        createGame();
        isGameStopped = false;
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                //Do not count the number of adjacent mines for a cell that is a mine
                if (!gameField[y][x].isMine) {
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < neighbors.size(); i++) {
                        if (neighbors.get(i).isMine) {
                            gameField[y][x].countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        if (isGameStopped) return;
        GameObject gameObject = gameField[y][x];
        if (gameObject.isFlag || gameObject.isOpen) return;
        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, Color.WHITE);
        if (gameObject.isMine) {
            setCellValue(x, y, MINE);
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else {
            setScore(score + 5);
            if (gameObject.countMineNeighbors == 0) {
                for (GameObject neighbor : getNeighbors(gameObject)) {
                    if (!neighbor.isOpen) {
                        openTile(neighbor.x, neighbor.y);
                    }
                }
                setCellValue(x, y, "");
            } else {
                setCellNumber(x, y, gameObject.countMineNeighbors);
            }
            if (countClosedTiles - countMinesOnField == 0) {
                win();
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x, y);
    }

    private void markTile(int x, int y) {
        GameObject object = gameField[y][x];

        if (object.isOpen || isGameStopped || (countFlags == 0 && !object.isFlag)) {
            return;
        }
        if (object.isFlag) {
            countFlags++;
            object.isFlag = false;
            setCellValue(x, y, "");
            setCellColor(x,y,Color.ORANGE);
        } else if (countFlags > 0) {
            countFlags--;
            object.isFlag = true;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void gameOver() {
        showMessageDialog(Color.WHITE, "GAME OVER", Color.BLACK, 50);
        isGameStopped = true;
    }

    private void win() {
        isGameStopped=true;
        showMessageDialog(Color.WHITE, "YOU WIN!", Color.BLACK, 50);
    }

}