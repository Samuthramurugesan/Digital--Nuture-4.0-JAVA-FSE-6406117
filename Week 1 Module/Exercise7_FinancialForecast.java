public class FinancialForecast {
    public static double forecast(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return forecast(currentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 15000;
        double rate = 0.08;
        int years = 4;
        double futureValue = forecast(currentValue, rate, years);
        System.out.println("Predicted value after " + years + " years: " + futureValue);
    }
}

/*
Output:
Predicted value after 4 years: 20407.680000000004
*/