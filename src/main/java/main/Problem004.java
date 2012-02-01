package main;

/* Problem Statement
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99. 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int largest = 0;
		int i = 999;
		while (i >= 100) {
			int j = 998;
			while (j >= 100) {
				if (isPalindrome(i * j) && (largest < i * j)) {
					System.out.println("i & j: " + i + "\t" + j);
					largest = i * j;
					break;
				} else {
					j--;
				}
			}
			i--;
		}
		long end = System.currentTimeMillis();
		System.out.println("palindrome found: " + largest);
		System.out.println("program ran for: " + (end - start) + " MiSeconds");

	}

	private static boolean isPalindrome(int number) {
		int n = number;
		int rev = 0;
		int dig = 0;
		while (n > 0) {
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}
		if (rev == number)
			System.out.println("number, rev: " + number + " " + rev);

		return (number == rev);
	}
}
