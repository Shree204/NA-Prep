package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from the beginning and end of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If the loop completes without finding a mismatch, it's a palindrome
    }
}

