package com.codegym.task.task29.task2907;

import java.math.BigDecimal;

/* 
This weird BigDecimal

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getValue(1.1d, 1.2d));
        System.out.println(getValue(-1.1d, 1.1d));
        System.out.println(getValue(.100d, 1.100d));
    }

    public static BigDecimal getValue(double v1, double v2) {
        return new BigDecimal(String.valueOf(v1)).add(new BigDecimal(String.valueOf(v2)));
    }
}
