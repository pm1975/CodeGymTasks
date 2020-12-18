package com.codegym.task.task22.task2211;

import java.io.*;

/* 
Changing the encoding

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"))) {

            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s + "\n");
            }
        }
    }
}
