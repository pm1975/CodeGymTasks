package pl.codegym.task.task07.task0706;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ulice i domy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                sumEven += ints[i];
            } else {
                sumOdd += ints[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        } else {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
        }
    }
}
