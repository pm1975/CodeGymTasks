package pl.codegym.task.task12.task1220;

/* 
Klasa Human i interfejsy CanRun i CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanRun, CanSwim {

    }

    public interface CanRun {
        public void Run();
    }

    public interface CanSwim {
        public void Swim();
    }

}
