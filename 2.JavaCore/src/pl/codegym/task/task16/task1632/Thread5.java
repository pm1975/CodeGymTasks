package pl.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piotr on 2020-10-08
 */
public class Thread5 extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            while (!line.contains("N")) {
                sum += Integer.parseInt(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
