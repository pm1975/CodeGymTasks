package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Najdłuższa sekwencja
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int counterMax = 1;
        int counter = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int list1 = list.get(i);
            int list2 = list.get(i + 1);
            if (list1 == list2) {
                counter++;
            }
            else counter = 1;
            if (counter > counterMax)
                counterMax = counter;
        }
        System.out.println(counterMax);
    }
}