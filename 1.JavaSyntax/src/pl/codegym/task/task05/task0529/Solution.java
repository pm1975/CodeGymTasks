package pl.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bank-świnka na bazie konsoli
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s = buffer.readLine();
            if (s.equals("wyjdz")) {
                break;
            } else if (s.equals("sumuj")) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(s);
            }
        }
    }
}
