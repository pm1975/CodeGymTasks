package com.codegym.task.task29.task2913;

import java.util.Random;

/* 
Replace recursion

*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        String text = a + "";
        if (a > b) {
            for (int i = a - 1; i >= b; i--) {
                text += " " + i;
            }
        } else {
            for (int i = a + 1; i <= b; i++) {
                text += " " + i;
            }
        }
        return text;
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}