package pl.codegym.task.task15.task1518;

/* 
Modyfikatory statyczne i kociaki
*/

public class Solution {
    public static Cat cat = new Cat();
    static {
        cat.setName("fiemon");
        System.out.println(cat.getName());
    }

    public static void main(String[] args) {

    }

    static public class Cat {
        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
