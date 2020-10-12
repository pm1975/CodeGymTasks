package pl.codegym.task.task16.task1632;

/**
 * Created by Piotr on 2020-10-07
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
