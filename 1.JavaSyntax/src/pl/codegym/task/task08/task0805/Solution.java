package pl.codegym.task.task08.task0805;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Wartości, na ekran!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Sim", "Sim");
        mapa.put("Tom", "Tom");
        mapa.put("Arbus", "Arbus");
        mapa.put("Dzieciak", "Dzieciak");
        mapa.put("Kot", "Kot");
        mapa.put("Pies", "Pies");
        mapa.put("Je", "Je");
        mapa.put("Jedzonko", "Jedzonko");
        mapa.put("Gevey", "Gevey");
        mapa.put("Przytulas", "Przytulas");

        printWartosci(mapa);
    }

    public static void printWartosci(Map<String, String> mapa) {
        Iterator<Map.Entry<String, String>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getValue());
        }
    }
}
