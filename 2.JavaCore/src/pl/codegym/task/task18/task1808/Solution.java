package pl.codegym.task.task18.task1808;

/* 
Dzielenie pliku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        byte[] buffer;
        int half;
        try (FileInputStream inputStream = new FileInputStream(fileName1)) {
            buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            half = buffer.length / 2;
            if ((buffer.length % 2) != 0) half++;
        }
        try (FileOutputStream outputStream = new FileOutputStream(fileName2)) {
            outputStream.write(buffer, 0, half);
        }
        try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
            outputStream.write(buffer, half, buffer.length - half);
        }
    }
}
