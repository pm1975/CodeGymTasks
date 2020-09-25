package pl.codegym.task.task15.task1522;

/**
 * Created by Piotr on 2020-09-16
 */
public class Moon implements Planet {
    private static volatile Moon instance = null;

    private Moon() {
        if (instance != null) {
            throw new RuntimeException("Not allowed. Please use getInstance() method.");
        }
    }

    public static Moon getInstance() {
        synchronized (Moon.class) {
            if (instance == null) {
                instance = new Moon();
            }
        }
        return instance;
    }
}
