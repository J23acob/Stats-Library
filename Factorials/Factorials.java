import java.math.BigInteger;

public class Factorials {
    // Factorial using long
    public static long factorialWithLong(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Factorial using BigInteger
    public static BigInteger factorialWithBigInteger(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
