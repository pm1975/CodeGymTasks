package pl.codegym.task.task18.tworzenie_pliku_z_wielu_partN;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Tworzenie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
                return number1 - number2;
            }
        });
        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("end")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }
        if (outputFile == null) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    /*
                    int read(byte[] buff);
                    Metoda ta natychmiast wczytuje blok bajtów do bufora (tablicy bajtów), dopóki bufor
                    nie będzie pełny lub dopóki źródło nie będzie miało więcej bajtów do wczytania.
                    Metoda zwraca liczbę faktycznie wczytanych bajtów (która może być mniejsza niż
                    długość tablicy).
                     */
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        /*
                        void write(byte[] buff, int from, int count);
                        Metoda ta zapisuje część bloku bajtów. Używana jest w przypadkach,
                        gdy tablica bajtów mogła nie zostać wypełniona w całości.
                         */
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}
