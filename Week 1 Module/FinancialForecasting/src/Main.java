package src;

public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // 5% annual growth
        int years = 5;                // Forecast for 5 years

        double futureValue = FinancialForecast.forecast(initialValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f\n", futureValue);

        double[] memo = new double[years + 1];
        double optimizedValue = FinancialForecast.optimizedForecast(initialValue, growthRate, years, memo);
        System.out.printf("Future Value (Optimized Recursive): %.2f\n", optimizedValue);
    }
}
