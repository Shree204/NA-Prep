package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumbersInRange(start, end);

        scanner.close();
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void printArmstrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
