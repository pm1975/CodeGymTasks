package pl.codegym.task.task15.task1507;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(double m, int n, String value) {
        System.out.println("double int String");
        printMatrix((int)m, n, (Object) value);
    }
    public static void printMatrix(int m, double n, String value) {
        System.out.println("int double String");
        printMatrix(m, (int)n, (Object) value);
    }
    public static void printMatrix(double m, double n, String value) {
        System.out.println("double double String");
        printMatrix((int)m, (int)n, (Object) value);
    }
    public static void printMatrix(double m, int n, Object value) {
        System.out.println("double int Object");
        printMatrix(m, n, value);
    }
    public static void printMatrix(int m, double n, Object value) {
        System.out.println("int double Object");
        printMatrix(m, n, value);
    }
    public static void printMatrix(double m, double n, Object value) {
        System.out.println("double double Object");
        printMatrix(m, n, value);
    }
    public static void printMatrix(int m, int n, String value, boolean b) {
        System.out.println("int int String boolean");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value, boolean b) {
        System.out.println("int int Object boolean");
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
