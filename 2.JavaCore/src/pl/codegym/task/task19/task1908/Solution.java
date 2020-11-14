package pl.codegym.task.task19.task1908;

/* 
Wybieranie numerów
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for (String s : list) {
                String[] split = s.split(" ");
                for (String s1 : split) {
                    try {
                        int i = Integer.parseInt(s1);
                        writer.write(i + " ");
                    } catch (Exception ignore) {
                        // not digit
                    }
                }
            }
        }
    }
}
