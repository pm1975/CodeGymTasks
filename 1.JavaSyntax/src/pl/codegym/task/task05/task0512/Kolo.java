package pl.codegym.task.task05.task0512;

/* 
Utwórz klasę Kolo
*/

public class Kolo {
    int srodekX, srodekY, promien, szerokosc, kolor;

    public void inicjalizuj(int srodekX, int srodekY, int promien) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
    }

    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
    }

    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc, int kolor) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }


    public static void main(String[] args) {

    }
}
