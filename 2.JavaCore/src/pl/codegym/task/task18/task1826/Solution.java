package pl.codegym.task.task18.task1826;

/* 
Szyfrowanie
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        try (FileInputStream inputStream = new FileInputStream(args[1]);
            FileOutputStream outputStream = new FileOutputStream(args[2])) {

            if (mode.contains("-e")) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() + 32);
                }
            } else {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read() - 32);
                }
            }
        }

    }

}
