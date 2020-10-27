package pl.codegym.task.task18.task1816;

/* 
ABC
*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s = args[0];
        int counter = 0;
        Character[] ENGLISH_CHARACTERS_ARRAY = new Character[]{
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<Character> ENGLISH_CHARACTERS = new HashSet<>(Arrays.asList(ENGLISH_CHARACTERS_ARRAY));
        BufferedReader reader = new BufferedReader(new FileReader(s));
        while (reader.ready()) {
            char read = (char) reader.read();
            if (ENGLISH_CHARACTERS.contains(read)) {
                counter++;
            }
        }
        reader.close();
        System.out.println(counter);
    }
}
