package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Ludzie> list = new ArrayList<Ludzie>();
        Ludzie paweł = new Ludzie("Paweł", true, 72);
        list.add(paweł);
        Ludzie stanisława = new Ludzie("Stanisława", false, 65);
        list.add(stanisława);
        Ludzie edmund = new Ludzie("Edmund", true, 84);
        list.add(edmund);
        Ludzie czesława = new Ludzie("Czesława", false, 80);
        list.add(czesława);
        Ludzie piotr = new Ludzie("Piotr", true, 45);
        paweł.dzieci.add(piotr);
        stanisława.dzieci.add(piotr);
        list.add(piotr);
        Ludzie bożena = new Ludzie("Bożena", false, 45);
        edmund.dzieci.add(bożena);
        czesława.dzieci.add(bożena);
        list.add(bożena);
        Ludzie barbara = new Ludzie("Barbara", false, 20);
        piotr.dzieci.add(barbara);
        bożena.dzieci.add(barbara);
        list.add(barbara);
        Ludzie anna = new Ludzie("Anna", false, 18);
        piotr.dzieci.add(anna);
        bożena.dzieci.add(anna);
        list.add(anna);
        Ludzie krzysztof = new Ludzie("Krzysztof", true, 8);
        piotr.dzieci.add(krzysztof);
        bożena.dzieci.add(krzysztof);
        list.add(krzysztof);
        for (Ludzie ludzie : list) {
            System.out.println(ludzie);
        }
    }

    public static class Ludzie {
        public String imie;
        public boolean plec;
        public int wiek;
        public ArrayList<Ludzie> dzieci = new ArrayList<Ludzie>();

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
