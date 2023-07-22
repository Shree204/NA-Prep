package PLTAlgorithmicQuestions;

public class SmallestSumOfConsecutiveNumbers {

    public static int findSmallestSum(int[] arr) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : arr) {
            // Add the current number to the currentSum
            currentSum += num;

            // If currentSum becomes negative, reset it to 0, as starting a new consecutive sequence would yield a smaller sum
            if (currentSum < 0) {
                currentSum = 0;
            }

            // Update minSum with the minimum encountered so far
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        int smallestSum = findSmallestSum(arr);
        System.out.println("Smallest Sum of Consecutive Numbers: " + smallestSum); // Output: -6
    }
}