package pl.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        while (number > 0) {
            int tempNumber = number % 10;
            if (tempNumber % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
            number = number / 10;
        }
        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
    }
}
