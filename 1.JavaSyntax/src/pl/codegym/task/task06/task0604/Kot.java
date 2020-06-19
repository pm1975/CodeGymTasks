package pl.codegym.task.task06.task0604;

/* 
Licznik kotów
*/

public class Kot {
    public static int licznikKotow = 0;

    public Kot() {
        licznikKotow++;
    }

    @Override
    protected void finalize() throws Throwable {
        licznikKotow--;
    }

    public static void main(String[] args) {

    }
}