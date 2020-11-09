package pl.codegym.task.task18.task1824;

/* 
Pliki i wyjątki
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream inputStream = new FileInputStream(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.printf(fileName);
                break;
            }
        }
    }
}
