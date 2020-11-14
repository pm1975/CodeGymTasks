package pl.codegym.task.task19.task1919;

/* 
Obliczanie wynagrodzeń
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        TreeMap<String, Double> salary = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String [] splitedLine = line.split(" ");
                String name = splitedLine[0];
                Double value = Double.parseDouble(splitedLine[1]);
                if (salary.containsKey(name)) {
                    Double currentValue = salary.get(name);
                    salary.put(name, value + currentValue);
                } else {
                    salary.put(name, value);
                }
            }
        }

        for (String key : salary.keySet()) {
            System.out.println(key + " " + salary.get(key));
        }
    }
}
