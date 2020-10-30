package pl.codegym.task.task18.task1822;

/* 
Wyszukiwanie danych wewnątrz pliku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.startsWith(args[0] + " ")) {
                    System.out.println(str);
                }
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
