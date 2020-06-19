package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer x : list) {
            if (x % 3 == 0 || x % 2 == 0) {
                if (x % 3 == 0) {
                    list1.add(x);
                }
                if (x % 2 == 0) {
                    list2.add(x);
                }
            } else {
                list3.add(x);
            }
        }
        printLista(list1);
        printLista(list2);
        printLista(list3);
    }

    public static void printLista(List<Integer> lista) {
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
