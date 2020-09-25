package pl.codegym.task.task14.task1408;

/**
 * Created by Piotr on 2020-09-05
 */
public class AfricanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.AFRICA +
                ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";
    }
}
