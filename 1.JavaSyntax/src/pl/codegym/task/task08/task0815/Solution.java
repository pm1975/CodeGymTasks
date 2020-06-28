package pl.codegym.task.task08.task0815;

import java.util.*;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mierniczak", "Piotr");
        map.put("Kowalski", "Bożena");
        map.put("Łatka", "Barbara");
        map.put("Legutko", "Anna");
        map.put("Orzeł", "Piotr");
        map.put("Klimczak", "Alicja");
        map.put("Kuson", "Kuba");
        map.put("Zając", "Klaudia");
        map.put("Wójcik", "Julia");
        map.put("Zwolenik", "Magda");
        return map;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        int exist = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == imie) {
                exist++;
            }
        }
        return exist;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        int exist = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey() == nazwisko) {
                exist++;
            }
        }
        return exist;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>(utworzMap());
//        Set<String> keySet = map.keySet();
//        System.out.println("Klucze:\n" + keySet);
//        Set<String> valueSet = new HashSet<>();
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> next = iterator.next();
//            valueSet.add(next.getValue());
//            System.out.println(next);
//        }
//        System.out.println("Wartości:\n" + valueSet);
//        System.out.println(map.size() + ", " + keySet.size());
//        System.out.println(getLicznikTakichSamychImion(utworzMap(), "Piotr"));
//        System.out.println(getLicznikTakichSamychNazwisk(utworzMap(), "Mierniczak"));

    }
}
