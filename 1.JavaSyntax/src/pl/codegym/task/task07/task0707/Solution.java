package pl.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
