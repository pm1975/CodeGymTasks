package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("ma");
        list.add("kota");
        for (int i = 1; i < list.size(); i++) {
            if (i % 2 != 0) {
                list.add(i, "As");
            }
        }
        if (list.get(list.size() - 1) != "As") {
            list.add("As");
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
