package pl.codegym.task.task18.Lesson7_Wrapper_System_in;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piotr on 2020-10-23
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Ola").append('\n');
        sb.append("Ania").append('\n');
        String data = sb.toString();

        ByteArrayInputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);

        readAndPrintLine();
    }

    private static void readAndPrintLine() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
