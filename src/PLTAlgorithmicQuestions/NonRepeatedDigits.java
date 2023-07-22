package PLTAlgorithmicQuestions;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedDigits {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 3, 7, 8};

        System.out.println("Non-repeated digits in the array:");
        printNonRepeatedDigits(numbers);
    }

    public static void printNonRepeatedDigits(int[] arr) {
        Map<Integer, Integer> digitCountMap = new HashMap<>();

        // Count the occurrences of each digit
        for (int num : arr) {
            digitCountMap.put(num, digitCountMap.getOrDefault(num, 0) + 1);
        }

        // Print the non-repeated digits
        for (int num : arr) {
            if (digitCountMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
