package PLTAlgorithmicQuestions;

public class EvenAndOddNumbers{
    public static void main(String[] args) {
        int[] numbers = {2, 7, 12, 9, 16, 21, 8, 15};

        System.out.println("Original Array:");
        printArray(numbers);

        System.out.println("\nEven Numbers:");
        printEvenNumbers(numbers);

        System.out.println("\nOdd Numbers:");
        printOddNumbers(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
