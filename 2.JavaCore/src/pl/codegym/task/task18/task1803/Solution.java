package pl.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Najczęściej występujące bajty
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream stream = new FileInputStream(fileName);
        int[] bytesArray = new int[255];
        while (stream.available() > 0) {
            bytesArray[stream.read()]++;
        }
        stream.close();

        int maxCount = 0;
        for (int i : bytesArray) {
            if (i > maxCount) maxCount = i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < bytesArray.length; i++) {
            if (bytesArray[i] == maxCount) list.add(i);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
