package pl.codegym.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> actions = new ArrayList<>();

        static {
            actions.add("Rozpocznij grę");
            actions.add("Zbierz zasoby");
            actions.add("Rozwijaj gospodarkę");
            actions.add("Zabijaj wrogów");
        }

        protected Gamer gamer1 = new Gamer("Smith", 3);
        protected Gamer gamer2 = new Gamer("Jones", 1);
        protected Gamer gamer3 = new Gamer("Gates", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            for (int i = 0; i < OnlineGame.actions.size(); i++) {
                if(!OnlineGame.isWinnerFound)
                {
                    try {
                        Thread.sleep(1000/rating);
                        System.out.println(getName() + ":" + OnlineGame.actions.get(i));
                        if (i == OnlineGame.actions.size() - 1)
                        {
                            OnlineGame.isWinnerFound = true;
                            System.out.println(getName() +":wygrał!");
                        }
                    } catch (InterruptedException e) {
                        System.out.println(getName() + ":przegrał!");
                    }
                }
            }
        }
    }
}
