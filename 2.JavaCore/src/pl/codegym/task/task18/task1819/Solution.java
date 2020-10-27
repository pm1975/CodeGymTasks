package pl.codegym.task.task18.task1819;

/* 
Łączenie plików
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        try (FileInputStream inputStream1 = new FileInputStream(nameFile1);
             FileInputStream inputStream2 = new FileInputStream(nameFile2)) {
            while (inputStream2.available() > 0) {
                byteArrayOutputStream.write(inputStream2.read());
            }
            while (inputStream1.available() > 0) {
                byteArrayOutputStream.write(inputStream1.read());
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(nameFile1);
        byteArrayOutputStream.writeTo(fileOutputStream);
        byteArrayOutputStream.close();
        fileOutputStream.close();
        reader.close();
    }
}
