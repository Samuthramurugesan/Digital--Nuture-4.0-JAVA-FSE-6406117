package src;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized recursive method with memoization (optional extension)
    public static double optimizedForecast(double currentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = optimizedForecast(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
