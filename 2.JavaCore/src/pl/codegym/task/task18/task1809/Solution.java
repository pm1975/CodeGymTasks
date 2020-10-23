package pl.codegym.task.task18.task1809;

/* 
Odwracanie pliku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        byte[] buffer;
        try (FileInputStream stream = new FileInputStream(fileName1)) {
            buffer = new byte[stream.available()];
            stream.read(buffer);
        }
        try (FileOutputStream stream = new FileOutputStream(fileName2)) {
            for (int i = buffer.length - 1; i >= 0; i--) {
                stream.write(buffer[i]);
            }
        }
    }
}
