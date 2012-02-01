package main;

import java.util.HashMap;

public class Problem002 {

	private static HashMap<Integer, Integer> memory = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		Integer total = 0;
		Integer value = 0;
		int count = 0;
		while (total < 4000000) {
			value = fib(count++);

			if (value % 2 == 0)
				total += value;
		}
		System.out.println("final value: " + total);
	}

	private static Integer fib(int i) {
		//
		if (i < 2)
			return 1;

		// from memory
		if (memory.containsKey(i))
			return memory.get(i);

		// result
		if (memory.get(i) == null)
			memory.put(i, fib(i - 1) + fib(i - 2));

		return memory.get(i);

	}
}
