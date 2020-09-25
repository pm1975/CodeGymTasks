package pl.codegym.task.task14.task1417;

/**
 * Created by Piotr on 2020-09-08
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
