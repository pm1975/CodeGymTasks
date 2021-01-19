package com.codegym.games.racer.road;

import com.codegym.games.racer.RacerGame;

public class RoadManager {
    public static final int LEFT_BORDER = RacerGame.ROADSIDE_WIDTH;
    public static final int RIGHT_BORDER = RacerGame.WIDTH - RacerGame.ROADSIDE_WIDTH;

    private RoadObject createRoadObject(RoadObjectType type, int x, int y) {
        if (type==RoadObjectType.SPIKE) {
            return new Spike(x, y);
        } else {
            return null;
        }
    }
}
