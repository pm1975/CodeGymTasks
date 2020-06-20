package pl.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            if (lista.get(i).contains("r") && !lista.get(i).contains("l")) {
                lista.remove(i);
            } else if (lista.get(i).contains("l") && !lista.get(i).contains("r")) {
                lista.add(lista.get(i));

            }
        }
        return lista;
    }
}