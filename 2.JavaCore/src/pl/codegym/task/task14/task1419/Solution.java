package pl.codegym.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Inwazja wyjątków
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // Pierwszy wyjątek
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        exceptions.add(new RuntimeException(""));
        exceptions.add(new IllegalAccessException(""));
        exceptions.add(new IOException(""));
        exceptions.add(new NullPointerException(""));
        exceptions.add(new Exception(""));
        exceptions.add(new IllegalArgumentException(""));
        exceptions.add(new IllegalMonitorStateException(""));
        exceptions.add(new IllegalStateException(""));
        exceptions.add(new IllegalThreadStateException(""));


        //tutaj wpisz swój kod

    }
}
