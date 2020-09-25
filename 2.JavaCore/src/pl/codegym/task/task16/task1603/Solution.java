package pl.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Lista i kilka wątków
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("To jest metoda run wewnątrz SpecialThread");
        }
    }
}
