public class FinancialForecasting {

    // Method to calculate future value using a recursive approach
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: If no years left, the future value is the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: Calculate the future value for (years - 1) and apply the growth rate
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;  // Current value
        double growthRate = 0.05;      // Annual growth rate (5%)
        int years = 10;                // Number of years in the future

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
