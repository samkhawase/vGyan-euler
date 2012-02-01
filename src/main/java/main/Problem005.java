package main;

/* Problem statement:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder. 
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem005 {

	public static void main(String[] args) {

		int number = 1;
		int smallestNumber = 0;
		
		while (number <= 1000000000) {
			
			if (number % 1 != 0){ number++; continue; }
			
			if (number % 2 != 0){ number++; continue; }
			
			if (number % 3 != 0){ number++; continue; }
			
			if (number % 4 != 0){ number++; continue; }
			
			if (number % 5 != 0){ number++; continue; }
			
			if (number % 6 != 0){ number++; continue; }
			
			if (number % 7 != 0){ number++; continue; }
			
			if (number % 8 != 0){ number++; continue; }
			
			if (number % 9 != 0){ number++; continue; }
			
			if (number % 10 != 0){ number++; continue; }
			
			if (number % 11 != 0){ number++; continue; }
			
			if (number % 12 != 0){ number++; continue; }
			
			if (number % 13 != 0){ number++; continue; }
			
			if (number % 14 != 0){ number++; continue; }
			
			if (number % 15 != 0){ number++; continue; }
			
			if (number % 16 != 0){ number++; continue; }
			
			if (number % 17 != 0){ number++; continue; }
			
			if (number % 18 != 0){ number++; continue; }
			
			if (number % 19 != 0){ number++; continue; }
			
			if (number % 20 != 0){ number++; continue; }			
			
			smallestNumber = number;
			break;
		}
		System.out.println("smallest Number: "+ smallestNumber);

	}

}
