package PLTAlgorithmicQuestions;
public class MergingTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array1:");
        printArray(array1);

        System.out.println("\nArray2:");
        printArray(array2);

        System.out.println("\nMerged Array:");
        printArray(mergedArray);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] mergedArray = new int[len1 + len2];

        System.arraycopy(arr1, 0, mergedArray, 0, len1);
        System.arraycopy(arr2, 0, mergedArray, len1, len2);

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
