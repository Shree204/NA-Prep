package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class CapitalizeFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String capitalizedString = capitalizeFirstAndLast(inputString);
        System.out.println("Capitalized string: " + capitalizedString);
    }

    public static String capitalizeFirstAndLast(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                String middle = word.substring(1, word.length() - 1);
                result.append(firstChar).append(middle).append(lastChar).append(" ");
            } else {
                result.append(word.toUpperCase()).append(" ");
            }
        }

        return result.toString().trim();
    }
}
