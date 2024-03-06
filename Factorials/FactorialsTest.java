import java.math.BigInteger;

public class FactorialsTest {
    public static void main(String[] args) {
        int[] testNumbers = {5, 10, 20, 30}; // Example numbers to calculate factorial for

        for (int n : testNumbers) {
            // Calculating factorial with long
            long factorialLong = Factorials.factorialWithLong(n);
            System.out.printf("Factorial of %d (using long): %d\n", n, factorialLong);

            // Calculating factorial with BigInteger
            BigInteger factorialBigInteger = Factorials.factorialWithBigInteger(n);
            System.out.printf("Factorial of %d (using BigInteger): %s\n", n, factorialBigInteger.toString());
        }
    }
}
