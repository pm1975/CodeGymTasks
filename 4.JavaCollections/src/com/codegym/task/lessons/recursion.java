package com.codegym.task.lessons;

public class recursion {
    public static void main(String[] args) {
        countDown(3);
    }

    private static void countDown(int x) {
        if (x <= 0)
            System.out.println("Boom!");
        else {
            System.out.println(x);
            countDown(x - 1);
            System.out.println(x);
        }
    }
}
