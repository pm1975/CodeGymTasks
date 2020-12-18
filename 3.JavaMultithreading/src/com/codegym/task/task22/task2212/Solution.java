package com.codegym.task.task22.task2212;

/* 
Phone number verification

*/

public class Solution {
    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        return (phoneNumber.matches("^\\+(\\d[\\-()]?){11}\\d$") ||
                phoneNumber.matches("^[(\\d]-?(\\d[\\-)]?){8}\\d$")) &&
                phoneNumber.matches("^(\\+)?(\\d)*(\\(\\d{3}\\))?(\\d+-?\\d+-?)?\\d+$");
    }

    public static void main(String[] args) {

    }
}
