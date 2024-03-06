public class TestConditionalProbability {
    public static void main(String[] args) {
        // Example probabilities
        double pAandB = 0.1; // Probability of both Event A and B occurring together
        double pB = 0.4; // Probability of Event B

        // Displaying the input probabilities
        System.out.println("Probability of both Event A and B occurring together (P(A and B)): " + pAandB);
        System.out.println("Probability of Event B (P(B)): " + pB);

        // Calculating and displaying the conditional probability
        try {
            double conditionalProbability = ConditionalProbability.calculate(pAandB, pB);
            System.out.println("Calculation: P(A|B) = P(A and B) / P(B)");
            System.out.println("Calculation: P(A|B) = " + pAandB + " / " + pB);
            System.out.println("The conditional probability of A given B (P(A|B)) is: " + conditionalProbability);
        } catch (IllegalArgumentException e) {
            System.err.println("Error calculating conditional probability: " + e.getMessage());
        }
    }
}

