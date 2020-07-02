package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        Iterator<Kot> iterator = koty.iterator();
        Kot next = iterator.next();
        koty.remove(next);

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        Set<Kot> koty = new HashSet<>();
        koty.add(new Kot("Mruczek"));
        koty.add(new Kot("Bonifacy"));
        koty.add(new Kot("Filemon"));
        return koty;
    }

    public static void printKoty(Set<Kot> koty) {
        for (Kot kot : koty) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public String getImie() {
            return imie;
        }

        public Kot(String imie) {
            this.imie = imie;
        }

        public Kot() {
        }

//        @Override
//        public String toString() {
//            return "Kot{" +
//                    "imie='" + imie + '\'' +
//                    '}';
//        }
    }
}
