package pl.codegym.task.task18.task1820;

/* 
Zaokrąglanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2));
        ) {
            while (bufferedReader.ready()) {
                String[] splittedLine = bufferedReader.readLine().split(" ");
                for (String s : splittedLine) {
                    double v = Double.parseDouble(s);
                    long round = Math.round(v);
                    printWriter.write(round + " ");
                }
            }
        }

    }
}
