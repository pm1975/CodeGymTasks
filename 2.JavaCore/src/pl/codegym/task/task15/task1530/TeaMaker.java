package pl.codegym.task.task15.task1530;

/**
 * Created by Piotr on 2020-09-21
 */
public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Weź kubek na herbatę");
    }

    @Override
    void addIngredients() {
        System.out.println("Nalej herbaty");
    }

    @Override
    void pour() {
        System.out.println("Napełnij wrzątkiem");
    }
}
