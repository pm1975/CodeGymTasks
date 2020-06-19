package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    public static ArrayList<Kot> koty;

    public Kot() {

    }

    public static void main(String[] args) {
        koty = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            koty.add(new Kot());
        }
        printKoty();
    }

    public static void printKoty() {
        for (int i = 0; i < koty.size(); i++) {
            System.out.println(koty.get(i));
        }
    }
}
