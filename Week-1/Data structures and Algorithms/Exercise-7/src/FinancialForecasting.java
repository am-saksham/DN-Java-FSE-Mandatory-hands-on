import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if(years == 0) {
            return presentValue;
        }
        return (1+growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValueOptimized(double presentValue, double growthRate, int years) {
        if(years == 0) {
            return presentValue;
        }

        if(memo.containsKey(years)) {
            return memo.get(years);
        }

        double result = (1+growthRate) * calculateFutureValueOptimized(presentValue, growthRate, years - 1);
        memo.put(years, result);
        return result;
    }
}
