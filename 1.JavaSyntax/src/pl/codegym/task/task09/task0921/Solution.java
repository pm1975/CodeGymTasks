package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {
        czytajDane();
    }

    public static void czytajDane() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            try {
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            } catch (IOException e) {
//                System.out.println(e);
                break;
            } catch (NumberFormatException e) {
//                System.out.println(e);
                break;
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
