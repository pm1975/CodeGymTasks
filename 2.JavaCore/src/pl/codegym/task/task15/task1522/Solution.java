package pl.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Praca nad wzorcem projektowym singleton
*/

public class Solution {
    public static void main(String[] args) {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    // Dodaj tutaj blok statyczny

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.contains(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (s.contains(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (s.contains(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            } else {
                thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
