package com.codegym.task.task21.test;

/**
 * Created by Piotr on 2020-12-10
 */
public class test {
    public static void main(String[] args) {
        char n = "Good news, everyone!".charAt(5);
        System.out.println(n);

        String s = "Good news, everyone!";
        for(char c: s.toCharArray())
        {
            System.out.println(c);
        }
    }
}
