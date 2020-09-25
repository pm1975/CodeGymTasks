package pl.codegym.task.task15.task1522;

/**
 * Created by Piotr on 2020-09-16
 */
public class Earth implements Planet {
    private static volatile Earth instance = null;

    private Earth() {
        if (instance != null) {
            throw new RuntimeException("Not allowed. Please use getInstance() method.");
        }
    }

    public static Earth getInstance() {
        synchronized (Earth.class) {
            if (instance == null) {
                instance = new Earth();
            }
        }
        return instance;
    }
}
