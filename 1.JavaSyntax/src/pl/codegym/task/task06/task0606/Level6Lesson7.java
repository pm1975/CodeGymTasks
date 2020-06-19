package pl.codegym.task.task06.task0606;

/**
 * Created by Piotr on 2020-06-15
 */
public class Level6Lesson7 {

    private static int licznikKotow = 0;

    public static void main(String[] args) throws Exception {
        Kot bella = new Kot("Bella");
        Kot tytus = new Kot("Tytus");

        System.out.println("Licznik kotów " + licznikKotow);
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
            Level6Lesson7.licznikKotow++;
        }
    }


}
