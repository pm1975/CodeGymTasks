package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    String imie, adres, kolor = "szary";
    int wiek = 1, waga = 1;

    public Kot(String imie) {
        this.imie = imie;
    }

    public Kot(String imie, int waga, int wiek) {
        this.imie = imie;
        this.waga  = waga;
        this.wiek = wiek;
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Kot(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
    }

    public Kot(int waga, String kolor, String adres) {
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
    }

    public static void main(String[] args) {

    }
}
