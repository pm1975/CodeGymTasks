package pl.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Liczby w kolejności rosnącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SortedSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        int[] ints = new int[5];
        int i = 0;
        for (Integer integer : integers) {
            ints[i] = integer;
            i++;
            //System.out.println(integer);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(ints[j]);
        }
    }
}
