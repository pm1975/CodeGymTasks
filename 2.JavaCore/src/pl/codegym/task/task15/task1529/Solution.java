package pl.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Praktyka z blokami statycznymi
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.contains("helikopter")) {
                result = new Helicopter();
            } else if (s.contains("samolot")) {
                result = new Plane(100);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
