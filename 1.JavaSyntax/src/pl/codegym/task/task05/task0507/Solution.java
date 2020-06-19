package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number;
        int sum = 0;
        int counter = 0;
        while (true) {
            number = Integer.parseInt(reader.readLine());
            if (number == -1) break;
            counter++;
            sum += number;
        }
        double result = sum * 1.0/counter * 1.0;
        System.out.println(result);;
    }
}

