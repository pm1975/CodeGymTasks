package pl.codegym.task.task15.task1530;

/**
 * Created by Piotr on 2020-09-21
 */
public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Weź kubek na latte");
    }

    @Override
    void addIngredients() {
        System.out.println("Zrób kawę");
    }

    @Override
    void pour() {
        System.out.println("Napełnij spienionym mlekiem");
    }
}
