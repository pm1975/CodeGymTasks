package pl.codegym.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piotr on 2020-11-17
 */
public class SolutionByCodeGym {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileIn.ready()) {
                String line = fileIn.readLine();
                System.out.println(new StringBuffer(line).reverse().toString());
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
