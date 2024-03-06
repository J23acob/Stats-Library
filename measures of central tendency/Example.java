//Lets off with a warmup :: Lets write a probram that can find mean median and mode.
//After that write a tester class to try it out
import java.util.Arrays;
public class Example
{
    
    //Something thats common in all stats classes that you take, is learning about
    //Central Tendancies
    
    //Mean, Median, and Mode
    
    //Mean ~> It's sum of elements divided by count. Another word for it could be "Expected"
    public double findMean(int[] userInput) {//2 options, using an array or and array list.
        //find the sum
        double sum = 0;
        for(int i = 0; i < userInput.length; i++){
            sum = userInput[i] + sum;
        }
        
        double result = sum / userInput.length;
        
        return result;
        
        
    }
    //Median ~> Either the middle number if odd, or "average" of the two middlest numbers.
    //The list must be ordered, so order the list before finding median. Should be able to call
    //collections sort or arrayList sort of some kind
    public double findMedian(int[] userInput){
        
        Arrays.sort(userInput);
        
        if(userInput.length % 2 != 0){
            return userInput[userInput.length / 2];
        } else {
            return (userInput[(userInput.length / 2) - 1] + userInput[userInput.length / 2]) / 2.0;
        }
    }
        
    
    
    //Mode ~> Is the number that occurs the most , but it must be unique, no 2 or more modes.
    public int findMode(int[] userInput) {
        if (userInput.length == 0) return -1;
        Arrays.sort(userInput);
        int previousNumber = userInput[0];
        int mode = previousNumber;
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < userInput.length; i++) {
            if (userInput[i] == previousNumber) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    mode = previousNumber;
                }
                previousNumber = userInput[i];
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            mode = userInput[userInput.length - 1];
        }

        int frequency = 0;
        for (int num : userInput) {
            int tempCount = 0;
            for (int j : userInput) {
                if (j == num) tempCount++;
            }
            if (tempCount == maxCount) frequency++;
            if (frequency > 1) return -1; // Mode is not unique
        }

        return mode; // Return mode or -1 if not found or not unique
    }
}

