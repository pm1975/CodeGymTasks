package pl.codegym.task.task16.task1632;

/**
 * Created by Piotr on 2020-10-08
 */
public class Thread4 extends Thread implements Message {
    @Override
    public void run() {
        while (!isInterrupted()) {

        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
