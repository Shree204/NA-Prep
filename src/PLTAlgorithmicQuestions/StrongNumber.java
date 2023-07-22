package PLTAlgorithmicQuestions;

public class StrongNumber {
    public static void main(String[] args) {
        int limit = 10000;

        System.out.println("Strong numbers between 1 and " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
