package pl.codegym.task.task09.task0909;

/* 
Wyjątek podczas pracy z tablicami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
