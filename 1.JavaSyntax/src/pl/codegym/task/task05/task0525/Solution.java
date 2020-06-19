package pl.codegym.task.task05.task0525;

/* 
Kaczka to za mało
*/

public class Solution {

    public static void main(String[] args) {
        Kaczka kaczka1 = new Kaczka();
        Kaczka kaczka2 = new Kaczka();
        System.out.println(kaczka1);
        System.out.println(kaczka2);

        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        System.out.println(kot1);
        System.out.println(kot2);

        Pies pies1 = new Pies();
        Pies pies2 = new Pies();
        System.out.println(pies1);
        System.out.println(pies2);
    }

    public static class Kaczka {
        public String toString() {
            return "Kaczka";
        }
    }

    public static class Kot extends Kaczka {
        @Override
        public String toString() {
            return "Kot";
        }
    }

    public static class Pies extends Kaczka {
        @Override
        public String toString() {
            return "Pies";
        }
    }
}
