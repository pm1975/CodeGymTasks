package pl.codegym.task.task19.task1914;

/* 
Rozwiązywanie problemów
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(out);
        String s = outputStream.toString();
        String[] split = s.split(" ");
        int i1 = Integer.parseInt(split[0]);
        String operator = split[1];
        int i2 = Integer.parseInt(split[2]);
        int result = 0;
        switch (operator)
        {
            case "+":
                result = i1 + i2;
                break;
            case "-":
                result = i1 - i2;
                break;
            case "*":
                result = i1 * i2;
                break;
        }
        System.out.println(s.replace("\n", "") + result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

