package pl.codegym.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koci kod się nie kompiluje
*/

public class Solution {

    public final static ArrayList<Kot> KOTY = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String imie = reader.readLine();

            if (imie.isEmpty()) break;
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tailLength = Integer.parseInt(reader.readLine());
            Kot kot = new Kot(imie, age, weight, tailLength);
            KOTY.add(kot);
        }

        printLista();
    }

    public static void printLista() {
        for (Kot kot : KOTY) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;
        private int wiek;
        private int waga;
        private int dlugoscOgona;

        Kot(String imie, int wiek, int waga, int dlugoscOgona) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.dlugoscOgona = dlugoscOgona;
        }

        @Override
        public String toString() {
            return "Imię kota: " + imie + ", wiek: " + wiek + ", waga: " + waga + ", ogon: " + dlugoscOgona;
        }
    }
}