package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        private int wiek;
        private int wysokosc;
        private int waga;
        private String imie;
        private String nazwisko;
        private Date data;

        public Ludzie(int wiek) {
            this.wiek = wiek;
        }

        public Ludzie(int wiek, int wysokosc) {
            this(wiek);
            this.wysokosc = wysokosc;
        }

        public Ludzie(int wiek, int wysokosc, int waga) {
            this(wiek, wysokosc);
            this.waga = waga;
        }

        public Ludzie(int wiek, int wysokosc, int waga, String imie) {
            this(wiek, wysokosc, waga);
            this.imie = imie;
        }

        public Ludzie(int wiek, int wysokosc, int waga, String imie, String nazwisko) {
            this(wiek, wysokosc, waga, imie);
            this.nazwisko = nazwisko;
        }

        public Ludzie(int wiek, int wysokosc, int waga, String imie, String nazwisko, Date data) {
            this(wiek, wysokosc, waga,imie, nazwisko);
            this.data = data;
        }

        public Ludzie(int wiek, int wysokosc, String imie) {
            this(wiek, wysokosc);
            this.imie = imie;
        }

        public Ludzie(int wiek, Date data) {
            this.wiek = wiek;
            this.data = data;
        }

        public Ludzie(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public Ludzie(int wiek, int wysokosc, String imie, String nazwisko) {
            this(wiek, wysokosc);
            this.imie = imie;
            this.nazwisko = nazwisko;
        }
    }
}
