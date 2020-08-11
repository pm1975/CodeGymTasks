package pl.codegym.task.task09.task0901;

/* 
Zwracanie śladu stosu
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
        //return Thread.currentThread().getStackTrace();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
    }

    public static StackTraceElement[] method1() {
        method2();
        //return Thread.currentThread().getStackTrace();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
        return trace;
    }

    public static StackTraceElement[] method2() {
        method3();
        //return Thread.currentThread().getStackTrace();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
        return trace;
    }

    public static StackTraceElement[] method3() {
        method4();
        //return Thread.currentThread().getStackTrace();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
        return trace;
    }

    public static StackTraceElement[] method4() {
        method5();
        //return Thread.currentThread().getStackTrace();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
        return trace;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : trace) {
            System.out.println(element.getMethodName());
        }
        return trace;
    }
}
