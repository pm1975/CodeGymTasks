package pl.codegym.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Zastępowanie liczb
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String s : split) {
                    try {
                        int i = Integer.parseInt(s.replace(".", ""));
                        if (map.containsKey(i)) {
                            System.out.print(map.get(i));
                            if (s.contains(".")) {
                                System.out.print(".");
                            }
                            System.out.print(" ");
                        } else {
                            System.out.print(s + " ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.print(s + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
