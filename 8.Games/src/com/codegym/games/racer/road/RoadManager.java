package com.codegym.games.racer.road;

import com.codegym.engine.cell.Game;
import com.codegym.games.racer.PlayerCar;
import com.codegym.games.racer.RacerGame;

import java.util.ArrayList;
import java.util.List;

public class RoadManager {
    public static final int LEFT_BORDER = RacerGame.ROADSIDE_WIDTH;
    public static final int RIGHT_BORDER = RacerGame.WIDTH - RacerGame.ROADSIDE_WIDTH;
    private static final int FIRST_LANE_POSITION = 16;
    private static final int FOURTH_LANE_POSITION = 44;
    private List<RoadObject> items = new ArrayList<>();

    private RoadObject createRoadObject(RoadObjectType type, int x, int y) {
        if (type == RoadObjectType.SPIKE) {
            return new Spike(x, y);
        } else {
            return new Car(type, x, y);
        }
    }

    private void addRoadObject(RoadObjectType roadObjectType, Game game) {
        int x = game.getRandomNumber(FIRST_LANE_POSITION, FOURTH_LANE_POSITION);
        int y = -1 * RoadObject.getHeight(roadObjectType);
        RoadObject roadObject = createRoadObject(roadObjectType, x, y);
        items.add(roadObject);
    }

    public void draw(Game game) {
        for (RoadObject item : items) {
            item.draw(game);
        }
    }

    public void move(int boost) {
        for (RoadObject item : items) {
            item.move(boost + item.speed);
        }
        deletePassedItems();
    }

    private boolean spikeExists() {
        for (RoadObject item : items) {
            if (item instanceof Spike) {
                return true;
            }
        }
        return false;
    }

    private void generateSpike(Game game) {
        int randomNumber = game.getRandomNumber(100);
        if (randomNumber < 10 && !spikeExists()) {
            addRoadObject(RoadObjectType.SPIKE, game);
        }
    }

    public void generateNewRoadObjects(Game game) {
        generateSpike(game);
        generateRegularCar(game);
    }

    private void deletePassedItems() {
        for (RoadObject item : new ArrayList<>(items)) {
            if (item.y >= RacerGame.HEIGHT) {
                items.remove(item);
            }
        }
    }

    public boolean checkCrash(PlayerCar playerCar) {
        for (RoadObject item : items) {
            if (item.isCollision(playerCar)) {
                return true;
            }
        }
        return false;
    }

    private void generateRegularCar(Game game) {
        if (game.getRandomNumber(100) < 30) {
            int carTypeNumber = game.getRandomNumber(4);
            addRoadObject(RoadObjectType.values()[carTypeNumber], game);
        }
    }
}
