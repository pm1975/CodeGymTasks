package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        File file = new File(fileName);

        //region javastart.pl
//        boolean fileExists = file.exists();
//        if (!fileExists) {
//            try {
//                fileExists = file.createNewFile();
//            } catch (IOException e) {
//                System.out.println("Nie udało się utworzyć pliku");
//            }
//        }
//
//        if (fileExists) {
//            System.out.println("Plik " + fileName + " istnieje lub został utworzony.");
//        }
        //endregion

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        String st;
        List<Integer> list = new ArrayList<Integer>();
        while ((st = br.readLine()) != null) {
            list.add(Integer.parseInt(st));
        }

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        for (Integer integer : sortedList) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
        fileInputStream.close();
    }
}
