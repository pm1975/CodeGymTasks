package pl.codegym.task.task10.task1011;

/* 
Dużo pieniędzy
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Wcale nie chcę uczyć się Javy. Chcę tylko dużo pieniędzy";
        for (int i = 0; i < 48; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }

}

