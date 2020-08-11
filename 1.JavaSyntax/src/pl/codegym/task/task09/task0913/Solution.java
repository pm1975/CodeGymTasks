package pl.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Wyjątki. Po prostu wyjątki.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //tutaj wpisz swój kod
    }

    public static void method1() throws NullPointerException, ArithmeticException,
            FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
