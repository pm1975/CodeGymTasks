package pl.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    static SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    static SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        String arg = args[0];
        if (arg.contains("-c")) {
            AddPerson(args);
        } else {
            int id = Integer.parseInt(args[1]);
            if (arg.contains("-u")) {
                UpdatePerson(id, args);
            } else if (arg.contains("-d")) {
                DeletePerson(id, args);
            } else if (arg.contains("-i")) {
                InfoPerson(id, args);
            }
        }
    }

    static void AddPerson(String[] args) throws ParseException {
        String name = args[1];
        Date date = dateFormat.parse(args[3]);
        if (args[2].equals("m")) {
            allPeople.add(Person.createMale(name, date));
        } else {
            allPeople.add(Person.createFemale(name, date));
        }
        System.out.println(allPeople.size() - 1);
    }

    static void UpdatePerson(int id, String[] args) throws ParseException {
        String name = args[2];
        Sex sex = args[3].contains("m") ? Sex.MALE : Sex.FEMALE;
        Date date = dateFormat.parse(args[4]);
        Person person = allPeople.get(id);
        person.setName(name);
        person.setSex(sex);
        person.setBirthDate(date);
        allPeople.set(id, person);
    }

    private static void DeletePerson(int id, String[] args) {
        Person person = allPeople.get(id);
        person.setBirthDate(null);
        person.setName(null);
        person.setSex(null);
    }

    private static void InfoPerson(int id, String[] args) throws ParseException {
        Person person = allPeople.get(id);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        String date = dateFormat.format(person.getBirthDate());
        String sex = person.getSex() == Sex.MALE ? "m" : "f";
        System.out.println(person.getName() + " " + sex + " " + date);
    }

}
