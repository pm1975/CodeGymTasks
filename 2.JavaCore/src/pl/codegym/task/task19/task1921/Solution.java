package pl.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
John Johnson
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fileName = "plik3.txt";
        fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                StringBuilder name = new StringBuilder(split[0]);
                for (int i = 1; i < split.length - 3; i++) {
                    name.append(" ").append(split[i]);
                }
                int month = Integer.parseInt(split[split.length - 3]);
                int day = Integer.parseInt(split[split.length - 2]);
                int year = Integer.parseInt(split[split.length - 1]);

                Date date = dateFormat.parse(
                        year + "-" +
                                month + "-" +
                                day);
                PEOPLE.add(new Person(name.toString(), date));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
//        for (Person person : PEOPLE) {
//            Date date = person.getBirthDate();
//            System.out.println(person.getName() + " " + dateFormat.format(date));
//        }
    }
}
