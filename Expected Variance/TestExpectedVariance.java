public class TestExpectedVariance {
    public static void main(String[] args) {
        // Example outcomes and their probabilities
        double[] outcomes = {1, 2, 3, 4, 5};
        double[] probabilities = {0.1, 0.2, 0.3, 0.2, 0.2}; // Must sum to 1

        // Calculating the expected value
        double expectedValue = ExpectedVariance.calculateExpectedValue(outcomes, probabilities);
        System.out.println("Expected Value: " + expectedValue);

        // Calculating the variance using the expected value
        double variance = ExpectedVariance.calculateVariance(outcomes, probabilities, expectedValue);
        System.out.println("Variance: " + variance);
    }
}
