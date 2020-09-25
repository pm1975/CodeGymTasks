package pl.codegym.task.task13.task1319;

import java.io.*;

/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        String text;
        do {
            text = reader.readLine();
            writer.write(text + "\n");
        } while (!"exit".equals(text));

        writer.close();
    }
}
