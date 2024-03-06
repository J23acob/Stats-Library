public class TestDependancy {
    public static void main(String[] args) {
        // Example probabilities
        double pA = 0.5; // Probability of Event A
        double pB = 0.4; // Probability of Event B
        double pAandB = 0.2; // Probability of both Event A and B occurring together

        // Checking if the events are independent
        boolean independent = Dependancy.areIndependent(pA, pB, pAandB);

        // Displaying the probabilities and the result
        System.out.println("Probability of Event A (P(A)): " + pA);
        System.out.println("Probability of Event B (P(B)): " + pB);
        System.out.println("Probability of both Event A and B (P(A and B)): " + pAandB);
        System.out.println("Based on the comparison, P(A) * P(B) = " + (pA * pB) + " and P(A and B) = " + pAandB);

        if (independent) {
            System.out.println("Conclusion: The events are independent.");
        } else {
            System.out.println("Conclusion: The events are dependent (not independent).");
        }
    }
}

