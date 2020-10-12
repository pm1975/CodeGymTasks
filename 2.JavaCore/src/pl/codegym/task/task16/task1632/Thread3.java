package pl.codegym.task.task16.task1632;

/**
 * Created by Piotr on 2020-10-08
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Hurra");
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
