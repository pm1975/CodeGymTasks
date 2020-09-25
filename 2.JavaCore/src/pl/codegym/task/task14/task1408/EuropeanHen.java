package pl.codegym.task.task14.task1408;

/**
 * Created by Piotr on 2020-09-05
 */
public class EuropeanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 23;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.EUROPE +
                ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
