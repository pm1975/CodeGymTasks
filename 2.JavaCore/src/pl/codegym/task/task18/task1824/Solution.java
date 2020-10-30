package pl.codegym.task.task18.task1824;

/* 
Pliki i wyjątki
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            while (true) {
                fileName = reader.readLine();
                if (new File(fileName).exists()) {
                    FileInputStream inputStream = new FileInputStream(fileName);
                    inputStream.close();
                } else {
                    System.out.println(fileName);
                    throw new FileNotFoundException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
