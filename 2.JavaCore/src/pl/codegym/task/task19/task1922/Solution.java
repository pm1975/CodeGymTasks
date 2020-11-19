package pl.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Wyszukiwanie właściwych linii
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        ArrayList<String> acceptedLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                int counter = 0;
                for (String s : split) {
                    if (words.contains(s)) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    acceptedLines.add(line);
                }
            }
        }
        for (String line : acceptedLines) {
            System.out.println(line);
        }
    }
}
