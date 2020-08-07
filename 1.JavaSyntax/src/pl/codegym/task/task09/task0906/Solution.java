package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {
        log("W metodzie main");
    }

    public static void log(String s) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTrace) {
//            System.out.println(element.getClassName());
//            System.out.println(element.getMethodName());
//        }
        StackTraceElement element = stackTrace[2];
        System.out.println(element.getClassName() + ": " + element.getMethodName() + ": " + s);
    }
}
