package pl.codegym.task.task09.task0927;

import java.util.*;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        HashMap<String, Kot> map = new HashMap<>();
        map.put("a", new Kot("a"));
        map.put("b", new Kot("b"));
        map.put("c", new Kot("c"));
        map.put("d", new Kot("d"));
        map.put("e", new Kot("e"));
        map.put("f", new Kot("f"));
        map.put("g", new Kot("g"));
        map.put("h", new Kot("h"));
        map.put("i", new Kot("i"));
        map.put("j", new Kot("j"));
        return map;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        Set<Kot> cats = new HashSet<Kot>();
        Iterator<Map.Entry<String, Kot>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Kot> next = iterator.next();
            cats.add(next.getValue());
        }
        return cats;
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
