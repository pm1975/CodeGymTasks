package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int theShortest = list.get(0).length();
        int theLongest = 0;
        for (String s : list) {
            if (s.length() > theLongest) {
                theLongest = s.length();
            }
            if (s.length() < theShortest) {
                theShortest = s.length();
            }
        }
        for (String s : list) {
            if (s.length() == theLongest || s.length() == theShortest) {
                System.out.println(s);
                break;
            }
        }
    }
}
