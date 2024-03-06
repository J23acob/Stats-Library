
public class Variance
{
    // Method to calculate variance
    public static double findVariance(int[] userInput) {
        double mean = findMean(userInput);
        double sumOfSquaredDifferences = 0;
        for (int num : userInput) {
            sumOfSquaredDifferences += Math.pow(num - mean, 2);
        }
        return sumOfSquaredDifferences / userInput.length;
    }

    // Static helper method to find the mean, needed for variance calculation
    private static double findMean(int[] userInput) {
        double sum = 0;
        for (int num : userInput) {
            sum += num;
        }
        return sum / userInput.length;
    }
}

