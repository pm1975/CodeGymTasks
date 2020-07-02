package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kowalski", 500);
        map.put("Nowak", 600);
        map.put("Wilk", 22000);
        map.put("Kiełbasa", 1000);
        map.put("Mierniczak", 499);
        map.put("Wnuk", 600);
        map.put("Piechnik", 660);
        map.put("Szczecha", 300);
        map.put("Bolek", 20);
        map.put("Kra", 30);
        return  map;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, Integer>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            if (value < 500) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>(utworzMap());
//        System.out.println("mapa");
//        printMap(map);
//        System.out.println("usuwanie < 500");
//        usunPozycjeZmap(map);
//        printMap(map);
    }

//    private static void printMap(HashMap<String, Integer> map) {
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> next = iterator.next();
//            Integer value = next.getValue();
//            String key = next.getKey();
//            System.out.println(key + " - " + value);
//        }
//    }
}