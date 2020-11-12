package pl.codegym.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Liczenie słów
 */

public class Solution {

    private static int counter = 0;

    public static void main(String[] args) throws IOException {

        String fileName;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        }

        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        String replaceString = text.toString()
                .replaceAll("\\p{Punct}", " ")
                .replaceAll("\\s", " ");

        for (String x : replaceString.split(" ")) {
            if (x.equals("świat")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
