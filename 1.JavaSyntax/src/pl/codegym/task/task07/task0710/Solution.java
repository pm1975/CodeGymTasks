package pl.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Na szczycie listy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(0, reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
