package com.codegym.task.task22.task22charsets;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Piotr on 2020-12-15
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        SortedMap<String,Charset> charsets = Charset.availableCharsets();
        for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
        Charset charset = Charset.defaultCharset();
        System.out.println(charset);

        String s = "Good news, everyone!";
        byte[] buffer = s.getBytes();
        printBuffer(buffer);
        System.out.println(new String(buffer));

        Charset koi8 = Charset.forName("KOI8-R");
        buffer = s.getBytes(koi8);
        printBuffer(buffer);
        System.out.println(new String(buffer));

        buffer = s.getBytes("Windows-1251");
        printBuffer(buffer);
        System.out.println(new String(buffer));

    }

    static void printBuffer(byte[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }
    }
}
