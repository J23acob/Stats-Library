

public class StandardDeviation
{
     public static double findStandardDeviation(int[] userInput) {
        double mean = findMean(userInput);
        double sumOfSquaredDifferences = 0;
        for (int num : userInput) {
            sumOfSquaredDifferences += Math.pow(num - mean, 2);
        }
        double meanOfSquaredDifferences = sumOfSquaredDifferences / userInput.length;
        return Math.sqrt(meanOfSquaredDifferences);
    }

    private static double findMean(int[] userInput) {
        double sum = 0;
        for (int num : userInput) {
            sum += num;
        }
        return sum / userInput.length;
    }
}
