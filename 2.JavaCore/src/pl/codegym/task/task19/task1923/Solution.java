package pl.codegym.task.task19.task1923;

/* 
Słowa z liczbami
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = "files/file1923_1.txt";
        String fileName2 = "files/file1923_2.txt";
        fileName1 = args[0];
        fileName2 = args[1];
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String s : split) {
                    if (s.matches(".*\\d.*")) {
                        list.add(s);
                    }
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for (String s : list) {
                writer.write(s + " ");
            }
        }
    }
}
