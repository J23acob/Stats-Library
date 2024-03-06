public class TestExample {
    public static void main(String[] args) {
        Example test = new Example();
        int[] mySampleNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sample dataset, modify as needed
        
        // Existing tests
        System.out.println("The mean is: " + test.findMean(mySampleNumbers));
        System.out.println("The median is: " + test.findMedian(mySampleNumbers));
        int modeResult = test.findMode(mySampleNumbers);
        if (modeResult != -1) {
            System.out.println("The mode is: " + modeResult);
        } else {
            System.out.println("There is no unique mode.");
        }
        System.out.println("The standard deviation is: " + StandardDeviation.findStandardDeviation(mySampleNumbers));
        
        // Testing variance calculation
        System.out.println("The variance is: " + Variance.findVariance(mySampleNumbers));
    }
}
