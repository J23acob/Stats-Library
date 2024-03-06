import java.util.Arrays;

public class SetOperations {
    // Union operation
    public static int[] union(int[] set1, int[] set2) {
        int[] temp = new int[set1.length + set2.length];
        int size = 0;
        for (int value : set1) {
            if (!contains(temp, value, size)) {
                temp[size++] = value;
            }
        }
        for (int value : set2) {
            if (!contains(temp, value, size)) {
                temp[size++] = value;
            }
        }
        return Arrays.copyOf(temp, size);
    }

    // Intersection operation
    public static int[] intersection(int[] set1, int[] set2) {
        int[] temp = new int[Math.min(set1.length, set2.length)];
        int size = 0;
        for (int value : set1) {
            if (contains(set2, value) && !contains(temp, value, size)) {
                temp[size++] = value;
            }
        }
        return Arrays.copyOf(temp, size);
    }

    // Difference operation (set1 - set2)
    public static int[] difference(int[] set1, int[] set2) {
        int[] temp = new int[set1.length];
        int size = 0;
        for (int value : set1) {
            if (!contains(set2, value)) {
                temp[size++] = value;
            }
        }
        return Arrays.copyOf(temp, size);
    }

    // Helper methods
    private static boolean contains(int[] array, int value, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    private static boolean contains(int[] array, int value) {
        return contains(array, value, array.length);
    }
}
