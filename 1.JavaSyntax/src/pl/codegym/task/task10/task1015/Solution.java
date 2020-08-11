package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();
        list[0].add("1-1");
        list[0].add("1-2");
        list[1] = new ArrayList<>();
        list[1].add("2-1");
        list[1].add("2-2");
        list[1].add("2-3");
        list[2] = new ArrayList<>();
        list[2].add("3-1");
        list[2].add("3-2");
        list[2].add("3-3");
        list[2].add("3-4");
        return list;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}