package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

//        SortedMap<Character, Integer> map = new TreeMap<>();
//        for (Character character : alfabet) {
//            map.put(character, 0);
//        }
//
//        for (String s : lista) {
//            char[] chars = s.toCharArray();
//            try {
//                for (char c : chars) {
//                    Integer integer = map.get(c);
//                    map.replace(c, ++integer);
//                }
//            } catch (Exception e) {
//                continue;
//            }
//        }
//
//        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Character, Integer> next = iterator.next();
//            Character key = next.getKey();
//            Integer value = next.getValue();
//            System.out.println(key + " " + value);
//        }
        int[] counter = new int[alfabet.size()];
        for (String s : lista) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < alfabet.size(); j++) {
                    if (chars[i] == alfabet.get(j)) {
                        counter[j] = counter[j] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < alfabet.size(); i++) {
            System.out.println(alfabet.get(i) + " " + counter[i]);
        }
    }

}
