package main;

public class ThousandNumbers {

	private static int totalSum = 0;

	public static void main(String[] ar) {

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println("i is currently: " + i);
				totalSum += i;
			}
		}
		System.out.println("the sum is :" + totalSum);
	}
}
