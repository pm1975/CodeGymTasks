package pl.codegym.task.task05.task0511;

/* 
Utwórz klasę Pies
*/

public class Pies {
    String imie;
    int wzrost;
    String kolor;

    public void inicjalizuj(String imie) {
        this.imie = imie;
    }

    public void inicjalizuj(String imie, int wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public void inicjalizuj(String imie, int wzrost, String kolor) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
