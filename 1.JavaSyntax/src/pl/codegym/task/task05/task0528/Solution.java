package pl.codegym.task.task05.task0528;

/* 
Wyświetl dzisiejszą datę
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
