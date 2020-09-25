package pl.codegym.task.task14.task1421;

/**
 * Created by Piotr on 2020-09-08
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {
        getInstance();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
