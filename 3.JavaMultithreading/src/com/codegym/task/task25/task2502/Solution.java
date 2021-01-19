package com.codegym.task.task25.task2502;

import java.util.*;

/* 
Don't take the car to the shop!

*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            Set<Wheel> wheelSet = new HashSet<>();
            String[] wheelNamesFromDB = loadWheelNamesFromDB();
            if (wheelNamesFromDB.length != 4) throw new IllegalArgumentException();
            for (String wheelName : wheelNamesFromDB) {
                wheelSet.add(Wheel.valueOf(wheelName));
            }
            if (wheelSet.size() != 4) throw new IllegalArgumentException();
            wheels = new ArrayList<>(wheelSet);
        }

        protected String[] loadWheelNamesFromDB() {
            // This method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
