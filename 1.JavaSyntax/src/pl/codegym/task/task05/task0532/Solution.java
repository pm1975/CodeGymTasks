package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0) {
            int maksimum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < number; i++) {
                int temp = Integer.parseInt(reader.readLine());
                maksimum = maksimum > temp ? maksimum : temp;
            }

            System.out.println(maksimum);

        }
    }
}
