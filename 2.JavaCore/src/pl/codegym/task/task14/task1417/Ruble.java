package pl.codegym.task.task14.task1417;

/**
 * Created by Piotr on 2020-09-08
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
