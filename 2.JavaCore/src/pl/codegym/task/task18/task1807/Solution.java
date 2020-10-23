package pl.codegym.task.task18.task1807;

/* 
Liczenie przecinków
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int counter = 0;
        try (FileInputStream stream = new FileInputStream(fileName)) {
            while (stream.available() > 0) {
                if (stream.read() == (int)',') {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
