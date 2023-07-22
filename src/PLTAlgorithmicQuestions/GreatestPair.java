package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class GreatestPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("The array should have at least two elements.");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int[] greatestPair = findGreatestPair(arr);
        System.out.println("The greatest pair is: (" + greatestPair[0] + ", " + greatestPair[1] + ")");
    }

    public static int[] findGreatestPair(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }

        int[] greatestPair = { firstLargest, secondLargest };
        return greatestPair;
    }
}
