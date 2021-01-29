package com.codegym.task.task25.task2512;

/* 
Charting our own course

*/

import java.util.LinkedList;

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        LinkedList<String> res = new LinkedList<>();
        while (e != null) {
            res.add(0, e.toString());
            e = e.getCause();
        }

        for (String s : res) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
    }
}
