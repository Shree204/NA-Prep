package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class StringReverse {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
	        if (areStringsReverse(str1, str2)) {
	            System.out.println("The two strings are reverse of each other.");
	        } else {
	            System.out.println("The two strings are not reverse of each other.");
	        }

	        scanner.close();
	    }

	    public static boolean areStringsReverse(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        String reversedStr1 = new StringBuilder(str1.toLowerCase()).reverse().toString();
	        return str2.equals(reversedStr1);
	    }
	}
