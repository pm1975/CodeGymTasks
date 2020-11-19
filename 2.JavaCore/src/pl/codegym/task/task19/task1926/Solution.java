package pl.codegym.task.task19.task1926;

/* 
Lustrzane odbicie
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(reverseString(line));
            }
        }
    }

    public static String reverseString(String text) {
        byte[] bytes = text.getBytes();
        byte[] result = new byte[bytes.length];
        for (int i = bytes.length - 1; i >= 0; i--) {
            result[result.length - i - 1] = bytes[i];
        }
        return new String(result);
    }
}
