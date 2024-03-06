import java.math.BigInteger;

public class TestCombine {
    public static void main(String[] args) {
        // Example values for n and r
        int n = 10;
        int r = 4;

        // Calculate and display permutations
        BigInteger permutations = Combine.permutation(n, r);
        System.out.println("Permutations (P(" + n + "," + r + ")) = " + permutations);

        // Calculate and display combinations
        BigInteger combinations = Combine.combination(n, r);
        System.out.println("Combinations (C(" + n + "," + r + ")) = " + combinations);
    }
}
