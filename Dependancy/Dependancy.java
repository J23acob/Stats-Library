public class Dependancy {
    // Checks if two events are independent
    public static boolean areIndependent(double pA, double pB, double pAandB) {
        // Events are independent if P(A and B) = P(A) * P(B)
        return Math.abs(pA * pB - pAandB) < 0.00001;
    }
}
