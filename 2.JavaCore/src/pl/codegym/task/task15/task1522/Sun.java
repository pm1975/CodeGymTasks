package pl.codegym.task.task15.task1522;

/**
 * Created by Piotr on 2020-09-16
 */
public class Sun implements Planet {
    private static volatile Sun instance = null;

    private Sun() {
        if (instance != null) {
            throw new RuntimeException("Not allowed. Please use getInstance() method.");
        }
    }

    public static Sun getInstance() {
        synchronized (Sun.class) {
            if (instance == null) {
                instance = new Sun();
            }
        }
        return instance;
    }
}
