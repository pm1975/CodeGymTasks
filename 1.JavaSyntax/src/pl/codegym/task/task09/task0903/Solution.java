package pl.codegym.task.task09.task0903;

/* 
Kto mnie wywołał?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] sladStosuElementy = Thread.currentThread().getStackTrace();
        return  sladStosuElementy[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] sladStosuElementy = Thread.currentThread().getStackTrace();
        return  sladStosuElementy[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] sladStosuElementy = Thread.currentThread().getStackTrace();
        return  sladStosuElementy[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] sladStosuElementy = Thread.currentThread().getStackTrace();
        return  sladStosuElementy[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] sladStosuElementy = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : sladStosuElementy) {
//            System.out.println(element.getLineNumber());
//            System.out.println(element.getMethodName());
//        }
//        System.out.println(sladStosuElementy[2].getLineNumber());
        return  sladStosuElementy[2].getLineNumber();
    }
}
