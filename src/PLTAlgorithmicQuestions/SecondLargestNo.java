package PLTAlgorithmicQuestions;

import java.util.Arrays;

public class SecondLargestNo {
	public static int SecondHighest(int[] a, int total) {
		Arrays.sort(a);
		return a[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 1,2,88,99,100};
		System.out.println("ThirdHighestInArray:" +SecondHighest(a,5));
	}

}
