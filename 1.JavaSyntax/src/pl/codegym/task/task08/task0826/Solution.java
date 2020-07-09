package pl.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Pięciu wygranych
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);
    }

    public static void sortuj(int[] tablica) {
        for (int j = 0; j < tablica.length; j++) {
            for (int i = tablica.length - 1; i > 0; i--) {
                if (tablica[i] > tablica[i - 1]) {
                    int temp = tablica[i - 1];
                    tablica[i - 1] = tablica[i];
                    tablica[i] = temp;
                }
            }
        }
    }
}
