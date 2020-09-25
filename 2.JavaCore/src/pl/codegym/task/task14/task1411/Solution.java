package pl.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/* 
User, loser, coder i programmer
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = Arrays.asList("user", "loser", "coder", "programmer");
        String s = reader.readLine();
        while (list.contains(s)) {

            if (s.contains("user")) {
                person = new Person.User();
            } else if (s.contains("loser")) {
                person = new Person.Loser();
            } else if (s.contains("coder")) {
                person = new Person.Coder();
            } else {
                person = new Person.Programmer();
            }

            doWork(person); // Wywołuje doWork
            s = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
