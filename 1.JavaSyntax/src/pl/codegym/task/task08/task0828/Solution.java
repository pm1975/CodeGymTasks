package pl.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Numer miesiąca
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Styczeń", 1);
        map.put("Luty", 2);
        map.put("Marzec", 3);
        map.put("Kwiecień", 4);
        map.put("Maj", 5);
        map.put("Czerwiec", 6);
        map.put("Lipiec", 7);
        map.put("Sierpień", 8);
        map.put("Wrzesień", 9);
        map.put("Październik", 10);
        map.put("Listopad", 11);
        map.put("Grudzień", 12);
        String s = reader.readLine();
        System.out.println(s + " to miesiąc nr " + map.get(s));
    }
}
