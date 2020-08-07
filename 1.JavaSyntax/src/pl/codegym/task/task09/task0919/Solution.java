package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args) {
        try {
            dzielimyPrzezZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
//            for (StackTraceElement element : e.getStackTrace()) {
//                System.out.println(element);
//            }
        }
    }

    public static void dzielimyPrzezZero() {
        System.out.println(5 / 0);
    }
}
