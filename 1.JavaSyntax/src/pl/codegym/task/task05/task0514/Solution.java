package pl.codegym.task.task05.task0514;

/* 
I programista stworzył człowieka
*/

public class Solution {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.inicjalizuj("Bolek", 12);
    }

    static class Osoba {
        String imie;
        int wiek;

        public void inicjalizuj(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }
    }
}
