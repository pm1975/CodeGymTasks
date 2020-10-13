package pl.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //tutaj wpisz swój kod
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
