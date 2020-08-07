package pl.codegym.task.task09.task0929;

import java.io.*;

/* 
Sprawmy, by kod robił coś pożytecznego!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String plikZrodlowyNazwa = reader.readLine();;
        InputStream fileInputStream = null;
        try {
            fileInputStream = getInputStream(plikZrodlowyNazwa);
        } catch (IOException e) {
            System.out.println("Plik nie istnieje");
            plikZrodlowyNazwa = reader.readLine();
            fileInputStream = getInputStream(plikZrodlowyNazwa);
        }

        String plikDocelowyNazwa = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(plikDocelowyNazwa);

        while (fileInputStream.available() > 0) {
            int dane = fileInputStream.read();
            fileOutputStream.write(dane);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String nazwaPliku) throws IOException {
        return new FileInputStream(nazwaPliku);
    }

    public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
        return new FileOutputStream(nazwaPliku);
    }
}

