package pl.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Wczytywanie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream stream = new FileInputStream(s);
        BufferedReader file = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = file.readLine()) != null) {
            System.out.println(line);
        }
        file.close();
        stream.close();
        reader.close();
    }
}