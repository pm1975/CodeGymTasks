package pl.codegym.task.task16.task1617;

/* 
Odliczanie na wyścigach
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            boolean start = true;
            while (numSeconds > 0) {
                System.out.printf(numSeconds-- + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Przerwany!");
                    start = false;
                }
            }
            if (start) {
                System.out.println("Start!");
            }
        }
    }
}
