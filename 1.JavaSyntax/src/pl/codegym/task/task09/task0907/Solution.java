package pl.codegym.task.task09.task0907;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
