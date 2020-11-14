package pl.codegym.task.task19.task1913;

/* 
Wyświetlaj tylko cyfry
*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream stream1 = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream2 = new PrintStream(outputStream);
        System.setOut(stream2);
        testString.printSomething();
        System.setOut(stream1);
        String s = outputStream.toString().replaceAll("\\D", "");
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
