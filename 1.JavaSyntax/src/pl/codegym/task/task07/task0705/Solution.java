package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[20];
        int[] ints1 = new int[10];
        int[] ints2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = ints[i];
        }
        for (int i = ints1.length; i < ints.length; i++) {
            ints2[i-ints1.length] = ints[i];
        }
        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }
    }
}
