package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(s);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy", new Locale("PL"));
        String s1 = dateFormat1.format(date);
        System.out.println(s1.toUpperCase());
    }
}
