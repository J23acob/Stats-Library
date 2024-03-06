import java.math.BigInteger;

public class BinomialProbability {
    // Binomial distribution
    public static double binomialDistribution(int n, int k, double p) {
        BigInteger coefficient = binomialCoefficient(n, k);
        return coefficient.doubleValue() * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }

    // Negative binomial distribution
    public static double negativeBinomialDistribution(int r, int n, double p) {
        BigInteger coefficient = binomialCoefficient(n - 1, r - 1);
        return coefficient.doubleValue() * Math.pow(p, r) * Math.pow(1 - p, n - r);
    }

    // Helper method to calculate binomial coefficient
    private static BigInteger binomialCoefficient(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    // Helper method to calculate factorial
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
