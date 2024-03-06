public class ExpectedVariance {
    // Calculates the expected value
    public static double calculateExpectedValue(double[] outcomes, double[] probabilities) {
        double expectedValue = 0;
        for (int i = 0; i < outcomes.length; i++) {
            expectedValue += outcomes[i] * probabilities[i];
        }
        return expectedValue;
    }

    // Calculates the variance
    public static double calculateVariance(double[] outcomes, double[] probabilities, double expectedValue) {
        double variance = 0;
        for (int i = 0; i < outcomes.length; i++) {
            variance += Math.pow(outcomes[i] - expectedValue, 2) * probabilities[i];
        }
        return variance;
    }
}
