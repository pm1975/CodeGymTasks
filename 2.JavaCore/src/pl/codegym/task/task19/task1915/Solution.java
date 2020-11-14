package pl.codegym.task.task19.task1915;

/* 
Powielanie tekstu
*/

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        PrintStream out = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(out);
        System.out.println(outputStream.toString());
        try (FileOutputStream stream = new FileOutputStream(fileName)) {
            stream.write(outputStream.toByteArray());
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("To jest tekst na potrzeby testów");
        }
    }
}

