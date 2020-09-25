package pl.codegym.task.task15.task1527;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Parser żądań
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        Map<String, String> map = getQueryMap(line);
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        LinkedList<String> keys = new LinkedList<String>();
        String s = "";
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            if (key.contains("obj")) {
                s = next.getValue();
            }
            keys.add(key);
        }
        for (String key : keys) {
            System.out.print(key + " ");
        }
        if (s.length() > 0) {
            System.out.println();
            try {
                double v = Double.parseDouble(s);
                alert(v);
            } catch (NumberFormatException e) {
                alert(s);
            }
        }
    }

    public static Map<String, String> getQueryMap(String query) {
        Map<String, String> map = new LinkedHashMap<>();
        int firstIndex = query.indexOf('?');
        String s = query.substring(firstIndex + 1);
        String[] params = s.split("&");

        for (String param : params) {
            String[] pair = param.split("=");
            String key = pair[0];
            String value = "";
            if (pair.length > 1) {
                value = pair[1];
            }
            map.put(key, value);
        }
        return map;
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
