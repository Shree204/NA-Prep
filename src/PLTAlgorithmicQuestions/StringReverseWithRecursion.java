package PLTAlgorithmicQuestions;

public class StringReverseWithRecursion {

public static String reverseString(String str) {
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        // Swap characters at left and right positions
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        // Move towards the middle
        left++;
        right--;
    }

    // Convert the reversed character array back to a string
    return new String(charArray);
}

public static void main(String[] args) {
    String originalString = "hello";
    String reversedString = reverseString(originalString);
    System.out.println("Original string: " + originalString);
    System.out.println("Reversed string: " + reversedString);
}
}

