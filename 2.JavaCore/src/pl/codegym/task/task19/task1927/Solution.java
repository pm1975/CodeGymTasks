package pl.codegym.task.task19.task1927;

/* 
Reklama kontekstowa
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream out = System.out;
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(out);
        String[] split = outputStream.toString().split("\\n");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println("CodeGym - kursy Java online");
            }
            System.out.println(split[i]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("pierwszy");
            System.out.println("drugi");
            System.out.println("trzeci");
            System.out.println("czwarty");
            System.out.println("piąty");
        }
    }
}
