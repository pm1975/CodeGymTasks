package pl.codegym.task.task15.task1530;

/**
 * Created by Piotr on 2020-09-21
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void addIngredients();
    abstract void pour();

    void makeDrink() {
        getRightCup();
        addIngredients();
        pour();
    }
}
