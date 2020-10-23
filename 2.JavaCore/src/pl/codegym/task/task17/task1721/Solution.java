package pl.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transakcyjność
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = null;
        String fileName2 = null;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader fReader1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while ((input = fReader1.readLine()) != null) {
                allLines.add(input);
            }
            fReader1.close();
            BufferedReader fReader2 = new BufferedReader(new FileReader(fileName2));
            while ((input = fReader2.readLine()) != null) {
                linesForRemoval.add(input);
            }
            fReader2.close();
            new Solution().joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
