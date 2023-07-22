package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        scanner.close();

        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);
    }
}
