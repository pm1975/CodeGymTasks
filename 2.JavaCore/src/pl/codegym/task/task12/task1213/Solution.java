package pl.codegym.task.task12.task1213;

/* 
„Popraw kod”, część 2
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Jestem kotkiem";
        }

        public abstract Pet getChild();
    }
}
