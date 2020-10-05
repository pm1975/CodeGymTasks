package pl.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Zmniejsz").start();
        new Thread(new CountUpRunnable(), "Zwiększ").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countUpIndex = 0;
        private int counterMax = Solution.number;

        public void run() {
            try {
                while (true) {
                    countUpIndex += 1;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countUpIndex == counterMax) return;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }

    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }

}
