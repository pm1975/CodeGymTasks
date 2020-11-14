package pl.codegym.task.task19.task1920;

/* 
Najbogatszy
*/

import java.io.*;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> salary = new TreeMap<>();
        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String[] splitedLine;
            String line;
            Double currentValue;

            while ((line = reader.readLine()) != null) {
                splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);
                if (salary.containsKey(name)) {
                    currentValue = salary.get(name);
                    salary.put(name, value + currentValue);
                } else {
                    salary.put(name, value);
                }
            }
        }

        double maxSalary = salary.firstEntry().getValue();
        for (double value : salary.values()) {
            if (value > maxSalary) {
                maxSalary = value;
            }
        }

        TreeSet<String> names = new TreeSet<>();
        for (String name : salary.keySet()) {
            if (maxSalary == salary.get(name)) {
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
