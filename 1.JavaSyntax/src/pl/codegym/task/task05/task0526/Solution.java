package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        Mezczyzna mezczyzna1 = new Mezczyzna("Piotr", 45, "Olszyna");
        Mezczyzna mezczyzna2 = new Mezczyzna("Paweł", 72, "Nowa Wieś");
        Kobieta kobieta1 = new Kobieta("Bożena", 45, "Olszyna");
        Kobieta kobieta2 = new Kobieta("Stanisława", 65, "Nowa Wieś");

        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }

    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        @Override
        public String toString() {
            return imie + " " + wiek + " " + adres;
        }
    }

    public static class Kobieta extends Mezczyzna {

        public Kobieta(String imie, int wiek, String adres) {
            super(imie, wiek, adres);
        }
    }

}
