package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.print("Prime factors of " + number + " are: ");
        findPrimeFactors(number);

        scanner.close();
    }

    public static void findPrimeFactors(int number) {
        if (number <= 1) {
            System.out.println("No prime factors for numbers less than 2.");
            return;
        }

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}
