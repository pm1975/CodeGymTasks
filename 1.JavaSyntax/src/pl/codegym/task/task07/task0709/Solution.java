package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int length = list.get(0).length();
        for (String s : list) {
            if (s.length() < length) {
                length = s.length();
            }
        }
        for (String s : list) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }
    }
}
