package com.codegym.games.spaceinvaders.gameobjects;

import com.codegym.games.spaceinvaders.Direction;
import com.codegym.games.spaceinvaders.ShapeMatrix;
import com.codegym.games.spaceinvaders.SpaceInvadersGame;

import java.util.List;

public class PlayerShip extends Ship {

    private Direction direction = Direction.UP;

    public void setDirection(Direction direction) {
        if (direction == Direction.DOWN)
            return;
        this.direction = direction;
    }

    public PlayerShip() {
        super(SpaceInvadersGame.WIDTH / 2., SpaceInvadersGame.HEIGHT - ShapeMatrix.PLAYER.length - 1);
        setStaticView(ShapeMatrix.PLAYER);
    }

    public void checkHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return;
        }

        if (isAlive) {
            for (Bullet bullet : bullets) {
                if (isAlive && bullet.isAlive && isCollision(bullet)) {
                    kill();
                    bullet.kill();
                    return;
                }
            }
        }
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }
        isAlive = false;

        super.setAnimatedView(
                ShapeMatrix.KILL_PLAYER_ANIMATION_FIRST,
                ShapeMatrix.KILL_PLAYER_ANIMATION_SECOND,
                ShapeMatrix.KILL_PLAYER_ANIMATION_THIRD,
                ShapeMatrix.DEAD_PLAYER);
    }


}