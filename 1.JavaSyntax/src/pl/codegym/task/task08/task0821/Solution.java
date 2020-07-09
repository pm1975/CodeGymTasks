package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mierniczak", "Piotr");
        map.put("Mierniczak", "Bożena");
        map.put("Mierniczak2", "Bożena");
        map.put("Mierniczak4", "Bożena4");
        map.put("Mierniczak5", "Bożena5");
        map.put("Mierniczak6", "Bożena6");
        map.put("Mierniczak7", "Bożena7");
        map.put("Mierniczak8", "Bożena8");
        map.put("Mierniczak9", "Bożena9");
        map.put("Mierniczak10", "Bożena10");
        return map;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
