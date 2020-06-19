package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    String imie;
    int wiek;
    int waga;
    String adres;
    String kolor;

    public void inicjalizuj(String imie) {
        this.imie = imie;
        wiek = 1;
        waga = 1;
        kolor = "szary";
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.waga = waga;
        this.wiek = wiek;
        kolor = "czarny";
    }

    public void inicjalizuj(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        waga = 1;
        kolor = "biały";
    }

    public void inicjalizuj(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
        wiek = 1;
    }

    public void inicjalizuj(int waga, String kolor, String adres) {
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
        wiek = 1;
    }

    public static void main(String[] args) {

    }
}
