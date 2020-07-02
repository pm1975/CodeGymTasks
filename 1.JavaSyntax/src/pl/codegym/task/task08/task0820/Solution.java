package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        HashSet<Pies> psy = new HashSet<>();
        psy.add(new Pies());
        psy.add(new Pies());
        psy.add(new Pies());
        return psy;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        HashSet<Object> zwierzeta = new HashSet<>();
        zwierzeta.addAll(koty);
        zwierzeta.addAll(psy);
        return zwierzeta;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        HashSet<Object> copy = new HashSet<>(zwierzeta);
        Iterator<Object> iterator = copy.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof Kot) {
                zwierzeta.remove(next);
            }
        }
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        for (Object o : zwierzeta) {
            System.out.println(o);
        }
    }

    public static class Kot {

    }

    public static class Pies {
    }

}
