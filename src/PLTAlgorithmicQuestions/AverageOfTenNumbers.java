package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class AverageOfTenNumbers {
    public static void main(String[] args) {
        int totalNumbers = 10;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + totalNumbers + " integers:");

        for (int i = 0; i < totalNumbers; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        scanner.close();

        double average = (double) sum / totalNumbers;
        System.out.println("The average value is: " + average);
    }
}
