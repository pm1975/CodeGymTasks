package com.codegym.task.task27Restaurant.task2702;

/* 
The required statement

*/

public class Solution {
    public static void main(String args[]) {
        label:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.print("");
                    continue;
                }
                System.out.print("S");
            }
            System.out.println();
        }
    }
}
