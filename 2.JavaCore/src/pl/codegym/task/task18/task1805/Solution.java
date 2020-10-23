package pl.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Sortowanie bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        TreeSet<Integer> set = new TreeSet<>();
        try (FileInputStream stream = new FileInputStream(fileName)) {
            while (stream.available() > 0) {
                set.add(stream.read());
            }
        }

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
