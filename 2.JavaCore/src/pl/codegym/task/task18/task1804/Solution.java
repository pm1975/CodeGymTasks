package pl.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Najrzadziej występujące bajty
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int[] bytesArray = new int[255];
        try (FileInputStream stream = new FileInputStream(fileName)) {
            while (stream.available() > 0) {
                bytesArray[stream.read()]++;
            }
        }

        int min = 255;
        for (int i = 0; i < bytesArray.length; i++) {
            if (bytesArray[i] < min && bytesArray[i] != 0) {
                min = bytesArray[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < bytesArray.length; i++) {
            if (bytesArray[i] == min) {
                list.add(i);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
