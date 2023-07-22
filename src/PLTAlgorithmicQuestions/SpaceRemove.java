package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class SpaceRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String stringWithoutSpaces = removeSpaces(inputString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        // Use the replaceAll method with regex to remove all spaces
        String stringWithoutSpaces = str.replaceAll("\\s+", "");
        return stringWithoutSpaces;
    }
}
