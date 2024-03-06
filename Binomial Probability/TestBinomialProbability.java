public class TestBinomialProbability {
    public static void main(String[] args) {
        // Binomial distribution example
        int n = 10; // Number of trials
        int k = 5;  // Number of successes
        double p = 0.5; // Probability of success on a single trial
        
        double binomialProb = BinomialProbability.binomialDistribution(n, k, p);
        System.out.println("Binomial Distribution (n=" + n + ", k=" + k + ", p=" + p + "): " + binomialProb);

        // Negative binomial distribution example
        int r = 5; // Number of successes to achieve
        int nForNegBinomial = 10; // Trial on which the rth success occurs
        double negBinomialProb = BinomialProbability.negativeBinomialDistribution(r, nForNegBinomial, p);
        System.out.println("Negative Binomial Distribution (r=" + r + ", n=" + nForNegBinomial + ", p=" + p + "): " + negBinomialProb);
    }
}
