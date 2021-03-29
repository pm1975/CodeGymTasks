package com.codegym.task.task30.task3009;

import java.util.HashSet;
import java.util.Set;

/* 
Palindrome?

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        // Expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        // Expected output: [6]
        System.out.println(getRadix("5321"));       // Expected output: []
        System.out.println(getRadix("1A"));         // Expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        HashSet<Integer> result = new HashSet<>();
        try {
            int numberToProcess = Integer.parseInt(number);
            for (int i = 2; i <= 36; i++) {
                String temp = Integer.toString(numberToProcess, i);
                if (isPalindrom(temp)) {
                    result.add(i);
                }
            }
        } catch (NumberFormatException e) {
        }
        return result;
    }

    private static boolean isPalindrom(String number) {
        return number.equals((new StringBuilder(number)).reverse().toString());
    }


}