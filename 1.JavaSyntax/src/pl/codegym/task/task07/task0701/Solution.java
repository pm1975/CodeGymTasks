package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Maksimum w tablicy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();
        int max = max(tablica);
        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        int[] table = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            table[i] = Integer.parseInt(reader.readLine());
        }
        return table;
    }

    public static int max(int[] tablica) {
        SortedSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i < tablica.length; i++) {
            integers.add(tablica[i]);
        }
        return integers.last();
    }
}
