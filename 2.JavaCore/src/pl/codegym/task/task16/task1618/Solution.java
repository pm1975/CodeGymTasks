package pl.codegym.task.task16.task1618;

/* 
Kolejne przerwanie
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //tutaj wpisz swój kod
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    //tutaj wpisz swój kod
    public static class TestThread extends Thread {
        public void run() {

        }
    }
}