package pl.codegym.task.task16.task1632;

/**
 * Created by Piotr on 2020-10-07
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
