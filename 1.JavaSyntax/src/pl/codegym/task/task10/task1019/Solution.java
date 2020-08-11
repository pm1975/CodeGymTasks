package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id;
        String imie = "";
        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
                imie = reader.readLine();
                map.put(imie, id);
                if (imie.length() == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                break;
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            imie = next.getKey();
            id = next.getValue();
            System.out.println(id + " " + imie);
        }
    }
}
