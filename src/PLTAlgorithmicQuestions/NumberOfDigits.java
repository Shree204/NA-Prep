package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(number);
        System.out.println("The number of digits in the integer is: " + digitCount);
    }

    public static int countDigits(int number) {
        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);

        // Special case for the number 0
        if (number == 0) {
            return 1;
        }

        // Count the digits using a loop
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
