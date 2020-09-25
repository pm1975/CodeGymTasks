package pl.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Waluty
*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " ma schowane " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            this.allMoney.add(new Euro(2));
            this.allMoney.add(new Ruble(3.33));
            this.allMoney.add(new USD(4.44));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
