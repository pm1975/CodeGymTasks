package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
    int lewy = 0, gora = 0, szerokosc = 0, wysokosc = 0;

    public void inicjalizuj() {

    }

    public void inicjalizuj(int lewy) {
        this.lewy = lewy;
    }

    public void inicjalizuj(int lewy, int gora) {
        this.lewy = lewy;
        this.gora = gora;
    }

    public void inicjalizuj(int lewy, int gora, int szerokosc, int wysokosc) {
        this.lewy = lewy;
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.wysokosc =wysokosc;
    }

    public static void main(String[] args) {

    }
}
