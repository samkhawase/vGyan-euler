package main;

/* Problem statement
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		long number = 600851475143L;
		long divisor = number;
		int factor = 2;
		while (factor <= divisor) {
			if ((divisor % factor) == 0) {
				System.out.println("factor found: " + factor);
				divisor /= factor;
			} else
				factor++;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("total time: " + (end - start));
		System.out.println("Start time: " + start + " \nEnd time :" + end);

	}
}
