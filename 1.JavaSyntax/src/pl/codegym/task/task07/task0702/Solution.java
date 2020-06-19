package pl.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Tablica z ciągami w odwrotnej kolejności
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        strings[0] = "first string";
        strings[1] = "second string";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = strings.length - 1; i >=0 ; i--) {
            System.out.println(strings[i]);
        }
    }
}