package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maksimum;
        int minimum;

        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        maksimum = minimum = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > maksimum) {
                maksimum = ints[i];
            }
            if (ints[i] < minimum) {
                minimum = ints[i];
            }
        }

        System.out.print(maksimum + " " + minimum);
    }
}
