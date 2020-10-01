package pl.codegym.task.task16.task1622;

/*
Nieprzerwane wątki
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //tutaj wpisz swój kod
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                try {
                    System.out.println(this);
                    if (--countdownIndex == 0) return;
                    //tutaj wpisz swój kod
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Wątek przerwany");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
