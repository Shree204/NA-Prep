package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class LengthOfStringWithoutFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int length = findStringLength(inputString);
        System.out.println("The length of the string is: " + length);
    }

    public static int findStringLength(String str) {
        int length = 0;
        // Iterate through the characters of the string and count them manually
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
}
