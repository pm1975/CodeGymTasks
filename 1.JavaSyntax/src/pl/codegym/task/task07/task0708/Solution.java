package pl.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Najdłuższy ciąg
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int length = 0;
        for (String s : strings) {
            if (s.length() > length) {
                length = s.length();
            }
        }
        for (String s : strings) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }
    }
}
