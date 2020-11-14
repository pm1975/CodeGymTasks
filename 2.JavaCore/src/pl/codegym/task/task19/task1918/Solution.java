package pl.codegym.task.task19.task1918;

/* 
Wprowadzanie znaczników
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String tag = args[0];
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
        }

        String fileContent = stringBuilder.toString().replaceAll("\r\n", "");

        String openTag = "<" + tag;
        String closingTag = "</" + tag;
        int tagLength = tag.length();
        int startTagIndex = 0;

        ArrayList<String> tags = new ArrayList<>();

        while (startTagIndex != -1 && startTagIndex < fileContent.length()) {
            startTagIndex = fileContent.indexOf(openTag, startTagIndex);
            int endTagIndex = fileContent.indexOf(closingTag, startTagIndex + tagLength);

            int indexInTag = startTagIndex + tagLength;
            if (endTagIndex != -1) {
                while (fileContent.substring(indexInTag, endTagIndex).contains(openTag)) {
                    indexInTag = endTagIndex + tagLength;
                    endTagIndex = fileContent.indexOf(closingTag, indexInTag);
                }
            }
            if (startTagIndex != -1 && endTagIndex != -1) {
                tags.add(fileContent.substring(startTagIndex, endTagIndex + tagLength + 3));
                startTagIndex += tagLength;
            }
        }

        for (String s : tags) {
            System.out.println(s);
        }
    }
}
