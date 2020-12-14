package com.codegym.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Build a WHERE query

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Johnson");
        params.put("country", "United States");
        params.put("city", "Los Angeles");
        params.put("age", null);

        System.out.println(getQuery(params));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value == null) {
                continue;
            }
            if (builder.length() > 0) {
                builder.append(" and ");
            }
            builder.append(s + " = '" + value + "'");
        }
        return builder.toString();
    }
}
