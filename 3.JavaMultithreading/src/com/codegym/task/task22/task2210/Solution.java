package com.codegym.task.task22.task2210;

/* 
StringTokenizer

*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            array[i++] = stringTokenizer.nextToken();
        }
        return array;
    }
}
