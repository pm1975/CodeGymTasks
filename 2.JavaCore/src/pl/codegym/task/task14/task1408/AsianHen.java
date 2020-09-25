package pl.codegym.task.task14.task1408;

/**
 * Created by Piotr on 2020-09-05
 */
public class AsianHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 15;
    }

    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.ASIA +
                ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
