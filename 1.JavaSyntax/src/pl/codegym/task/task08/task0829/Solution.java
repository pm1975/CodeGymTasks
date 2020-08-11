package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        // Lista adresów
//        List<String> adresy = new ArrayList<>();
//        while (true) {
//            String rodzina = reader.readLine();
//            if (rodzina.isEmpty()) break;
//
//            adresy.add(rodzina);
//        }
//
//        // Wczytuje numer domu
//        int numerDomu = Integer.parseInt(reader.readLine());
//
//        if (0 <= numerDomu && numerDomu < adresy.size()) {
//            String nazwiskoRodziny = adresy.get(numerDomu);
//            System.out.println(nazwiskoRodziny);
//        }
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
//<<<<<<< HEAD
//            if (city.isEmpty())
//=======
            if (city.isEmpty() && city != null)
                break;
            String surname = reader.readLine();
            if (city.isEmpty())
                break;
//            map.put(city, surname);
            map.put(surname, city);
        }

        //get surname
        String city = reader.readLine();
        System.out.println(map.get(city));

    }
}
