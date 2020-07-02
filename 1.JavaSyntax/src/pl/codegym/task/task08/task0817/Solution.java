package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mierniczak", "Piotr");
        map.put("Mierniczak2", "Bożena");
        map.put("Mierniczak3", "Basia");
        map.put("Mierniczak4", "Ania");
        map.put("Mierniczak5", "Krzysiu");
        map.put("Orzeł", "Piotr");
        map.put("Orzeł2", "Alicja");
        map.put("Orzeł3", "Klaudia");
        map.put("Orzeł4", "Julia");
        map.put("Orzeł5", "Magda");
        return map;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        HashMap<String, String> copy = new HashMap<>(mapa);
        HashSet<String> set = new HashSet<>();
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String value = next.getValue();
            if (!set.contains(value)) {
                set.add(value);
            } else {
                usunElementZMapPoWartosci(mapa, value);
            }
        }
    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc))
                mapa.remove(para.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>(utworzMap());
//        printMap(map);
//        System.out.println("Usuwa zdublowane imiona");
//        usunPowtorzoneImiona(map);
//        printMap(map);
    }
//    public static void printMap(Map<String, String> map) {
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> next = iterator.next();
//            String key = next.getKey();
//            String value = next.getValue();
//            System.out.println(key + " " + value);
//        }
//    }
}
