public class Main {
    public static void main(String[] args) {
        double currentPortfolioValue = 10000.0;
        double expectedAnnualGrowth = 0.05;
        int forecastYears = 10;

        System.out.println("--- Financial Forecasting Tool ---");
        System.out.println("Present Value: $" + currentPortfolioValue);
        System.out.println("Growth Rate: " + (expectedAnnualGrowth * 100) + "%");

        double standardResult = FinancialForecasting.calculateFutureValue(
            currentPortfolioValue, expectedAnnualGrowth, forecastYears
        );
        System.out.printf("\nStandard Recursive Forecast (10 years): $%.2f\n", standardResult);

        double optimizedResult = FinancialForecasting.calculateFutureValueOptimized(
            currentPortfolioValue, expectedAnnualGrowth, forecastYears
        );
        System.out.printf("Optimized Recursive Forecast (10 years): $%.2f\n", optimizedResult);
    }
}
