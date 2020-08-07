package pl.codegym.task.task09.task0905;

/* 
Krok po kroku po śladach stosu...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int glebokosc = getGlebokoscStosu();
    }

    public static int getGlebokoscStosu() {
        int glebokosc = Thread.currentThread().getStackTrace().length;
        System.out.println(glebokosc);
        return glebokosc;
    }
}

