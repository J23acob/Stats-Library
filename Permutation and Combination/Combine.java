import java.math.BigInteger;

public class Combine {
    // Calculates permutations: P(n, r) = n! / (n-r)!
    public static BigInteger permutation(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    // Calculates combinations: C(n, r) = n! / (r! * (n-r)!)
    public static BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
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
