package pl.codegym.task.task09.task0930;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : tablica) {
            if (isLiczba(s)) {
                list1.add(Integer.parseInt(s));
            } else {
                list2.add(s);
            }
        }
        Integer[] tab1 = list1.toArray(new Integer[list1.size()]);
        String[] tab2 = list2.toArray(new String[list2.size()]);
        for (int i = 0; i < tab1.length; i++) {
            for (int j = tab1.length - 1; j > i; j--) {
                if (tab1[j] > tab1[j - 1]) {
                    int s = tab1[j];
                    tab1[j] = tab1[j - 1];
                    tab1[j - 1] = s;
                }
            }
        }
        for (int i = 0; i < tab2.length; i++) {
            for (int j = tab2.length - 1; j > i; j--) {
                if (!isWiekszeOd(tab2[j], tab2[j - 1])) {
                    String s = tab2[j];
                    tab2[j] = tab2[j - 1];
                    tab2[j - 1] = s;
                }
            }
        }
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < tablica.length; i++) {
//            if (isLiczba(tablica[i])) {
//                tablica[i] = tab1[counter1++];
//            } else {
//                tablica[i] = tab2[counter2++];
//            }
            tablica[i] = isLiczba(tablica[i]) ? tab1[counter1++].toString() : tab2[counter2++];
        }
    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Ciąg zawiera łącznik
                    || (!Character.isDigit(c) && c != '-') // lub nie jest liczbą i nie zaczyna się łącznikiem
                    || (i == 0 && c == '-' && chars.length == 1)) // lub jest pojedynczym łącznikiem
            {
                return false;
            }
        }
        return true;
    }
}
