package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList

        ArrayList<String> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            lista.add(reader.readLine());
        }
        ArrayList<String> wynik = doubleValues(lista);

        for (String s : wynik) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) {
                lista.add(i, lista.get(i));
            }
        }
        return lista;
    }
}
