package com.codegym.games.spaceinvaders;

import com.codegym.engine.cell.*;
import com.codegym.games.spaceinvaders.gameobjects.Bullet;
import com.codegym.games.spaceinvaders.gameobjects.EnemyFleet;
import com.codegym.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int DIFFICULTY = 5;

    private List<Star> stars;
    private EnemyFleet enemyFleet;
    private List<Bullet> enemyBullets;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();
        check();

        Bullet bullet = enemyFleet.fire(this);
        if (bullet != null) {
            enemyBullets.add(bullet);
        }

        drawScene();
    }

    private void createGame() {
        enemyFleet = new EnemyFleet();
        enemyBullets = new ArrayList<>();
        createStars();
        drawScene();
        setTurnTimer(40);
    }

    private void drawScene() {
        drawField();
        enemyFleet.draw(this);

        for (Bullet bullet : enemyBullets) {
            bullet.draw(this);
        }
    }

    private void drawField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellValueEx(x, y, Color.BLACK, "");
            }
        }

        for (Star star : stars) {
            star.draw(this);
        }
    }

    private void createStars() {
        stars = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int x = getRandomNumber(WIDTH);
            int y = getRandomNumber(HEIGHT);
            stars.add(new Star(x, y));
        }
    }

    private void moveSpaceObjects() {
        enemyFleet.move();

        for (Bullet enemyBullet : enemyBullets) {
            enemyBullet.move();
        }
    }

    private void removeDeadBullets() {
        for (Bullet bullet : new ArrayList<>(enemyBullets)) {
            if (!bullet.isAlive || bullet.y >= HEIGHT - 1) {
                enemyBullets.remove(bullet);
            }
        }
    }

    private void check() {
        removeDeadBullets();
    }
}
