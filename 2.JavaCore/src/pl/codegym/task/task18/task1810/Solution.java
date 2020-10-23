package pl.codegym.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream stream = new FileInputStream(fileName)) {
                if (stream.available() < 1000) {
                    throw new DownloadException();
                }
            }

        }
    }

    public static class DownloadException extends Exception {

    }
}
