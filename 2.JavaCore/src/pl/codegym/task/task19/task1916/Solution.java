package pl.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Śledzenie zmian
*/

public class Solution {

    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
//        String fileName1 = "plik1.txt";
//        String fileName2 = "plik2.txt";
        String fileName1;
        String fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        List<String> lines1 = fileLines(fileName1);
        List<String> lines2 = fileLines(fileName2);

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < lines1.size() && counter2 < lines2.size()) {
            if (lines1.get(counter1).equals(lines2.get(counter2))) {
                lines.add(new LineItem(Type.SAME, lines1.get(counter1)));
                counter1++;
                counter2++;
            } else if (counter1 + 1 < lines1.size()
                    && lines1.get(counter1 + 1).equals(lines2.get(counter2))) {
                lines.add(new LineItem(Type.REMOVED, lines1.get(counter1)));
                counter1++;
            } else if (counter2 + 1 < lines2.size()
                    && lines1.get(counter1).equals(lines2.get(counter2 + 1))) {
                lines.add(new LineItem(Type.ADDED, lines2.get(counter2)));
                counter2++;
            } else {
                lines.add(new LineItem(Type.ADDED, lines1.get(counter1)));
                lines.add(new LineItem(Type.ADDED, lines2.get(counter2)));
                counter1++;
                counter2++;
            }
        }

        while (counter1 < lines1.size()) {
            lines.add(new LineItem(Type.REMOVED, lines1.get(counter1)));
            counter1++;
        }
        while (counter2 < lines2.size()) {
            lines.add(new LineItem(Type.ADDED, lines2.get(counter2)));
            counter2++;
        }

        for (LineItem line : lines) {
            System.out.println(line.type + " " + line.line);
        }
    }

    public static List<String> fileLines(String fileName1) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = reader.readLine()) != null)
            {
                list.add(line);
            }
        }
        return list;
    }


    public static enum Type {
        ADDED,        // Dodana nowa linia
        REMOVED,      // Linia usunięta
        SAME          // Bez zmian
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
