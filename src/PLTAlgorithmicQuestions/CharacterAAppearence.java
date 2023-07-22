package PLTAlgorithmicQuestions;

import java.util.Scanner;

public class CharacterAAppearence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int countA = countCharacterA(input);
        System.out.println("The number of times 'a' appears: " + countA);

        scanner.close();
    }

    public static int countCharacterA(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }

        return count;
    }
}
