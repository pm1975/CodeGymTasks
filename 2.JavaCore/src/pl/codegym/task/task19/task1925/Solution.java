package pl.codegym.task.task19.task1925;

/* 
Long words
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = "files/1925_1.txt";
        String fileName2 = "files/1925_2.txt";
        fileName1 = args[0];
        fileName2 = args[1];
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String s : split) {
                    String s1 = s.replaceAll("\\.", "");
                    if (s1.length() > 6) {
                        list.add(s1);
                    }
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            writer.write(String.join(",", list));
        }
    }
}
