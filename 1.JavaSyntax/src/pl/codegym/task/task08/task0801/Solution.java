package pl.codegym.task.task08.task0801;

/* 
HashSet roślin
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();
        set.add("arbuz");
        set.add("banan");
        set.add("wiśnia");
        set.add("gruszka");
        set.add("kantalupa");
        set.add("jeżyna");
        set.add("żeńszeń");
        set.add("truskawka");
        set.add("irys");
        set.add("ziemniak");
        set.add("ziemniak");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String tekst = iterator.next();
            System.out.println(tekst);
        }
    }
}
