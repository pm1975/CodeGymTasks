package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double minutes = scanner.nextDouble();
        int i = (int) minutes;
        String color = "";
        if (i % 5 == 0 || i % 5 == 1 || i % 5 == 2)
            color = "zielone";
        else if (i % 5 == 3) {
            color = "żółte";
        } else {
            color = "czerwone";
        }
        System.out.println(color);
    }
}