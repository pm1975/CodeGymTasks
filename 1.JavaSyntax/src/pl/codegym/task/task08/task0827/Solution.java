package pl.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("JANUARY 1 2000"));
    }

    public static boolean isDataNieparzysta(String date) {
        Date date1 = new Date(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        int i = calendar.get(Calendar.DAY_OF_YEAR);
        if (i % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}