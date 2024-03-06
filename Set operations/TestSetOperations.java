import java.util.Arrays;

public class TestSetOperations {
    public static void main(String[] args) {
        int[] set1 = {1, 2, 3, 4};
        int[] set2 = {3, 4, 5, 6};

        // Testing Union operation
        int[] unionResult = SetOperations.union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + Arrays.toString(unionResult));

        // Testing Intersection operation
        int[] intersectionResult = SetOperations.intersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + Arrays.toString(intersectionResult));

        // Testing Difference operation
        int[] differenceResult = SetOperations.difference(set1, set2);
        System.out.println("Difference (Set 1 - Set 2): " + Arrays.toString(differenceResult));
    }
}
