public class Main {
    public static void main(String[] args) {

        FinancialForecast forecast = new FinancialForecast();

        double presentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = forecast.predictFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Predicted Future Value: " + futureValue);
    }
}