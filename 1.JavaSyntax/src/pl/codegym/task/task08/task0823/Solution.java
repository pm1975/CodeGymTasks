package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

//        String[] s1 = s.split(" ");
//        for (int i = 0; i < s1.length; i++) {
//            s1[i] = s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1).trim();
//        }
//        List<String> list = Arrays.asList(s1);
//
//        String newString = String.join(" ", list);
//        System.out.println(newString);

        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
