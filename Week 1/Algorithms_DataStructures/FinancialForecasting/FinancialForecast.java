public class FinancialForecast {

    public double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) { // Base case
            return currentValue;
        }

        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }
}