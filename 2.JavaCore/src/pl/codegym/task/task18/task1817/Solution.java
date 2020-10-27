package pl.codegym.task.task18.task1817;

/* 
Spacje
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String s = args[0];
        int n1 = 0;
        int n2 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(s))) {
            while (reader.ready()) {
                char read = (char) reader.read();
                n1++;
                if (read == ' ') {
                    n2++;
                }
            }
            double result = (double) n2 / n1 * 100;
            System.out.printf("%.2f", result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
