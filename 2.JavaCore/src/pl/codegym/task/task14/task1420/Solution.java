package pl.codegym.task.task14.task1420;

/* 
NWD
*/

import jdk.jfr.events.ExceptionThrownEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(reader.readLine());
            number2 = Integer.parseInt(reader.readLine());
            if (number1 > 0 && number2 > 0) {
                int NWD = 0;
                if (number1 > number2) {
                    for (int i = 1; i <= number2; i++) {
                        if (number1 % i == 0 && number2 % i == 0) {
                            NWD = i;
                        }
                    }
                } else {
                    for (int i = 1; i <= number1; i++) {
                        if (number1 % i == 0 && number2 % i == 0) {
                            NWD = i;
                        }
                    }
                }
                System.out.println(NWD);
            }
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawny format");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!(number1 > 0 && number2 > 0)) {
            throw new Exception("Liczba ujemna");
        }
    }
}
