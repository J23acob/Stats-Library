public class ConditionalProbability {
    // Calculates the conditional probability of A given B: P(A|B)
    public static double calculate(double pAandB, double pB) {
        if (pB == 0) {
            throw new IllegalArgumentException("Probability of B cannot be 0.");
        }
        return pAandB / pB;
    }
}
