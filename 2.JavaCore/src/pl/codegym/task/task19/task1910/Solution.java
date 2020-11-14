package pl.codegym.task.task19.task1910;

/* 
Interpunkcja
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }

        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for (String s : list) {
                writer.write(s
                        .replaceAll("\\p{Punct}", "")
                        .replaceAll("\\n", "")
                );
            }
        }
    }
}
