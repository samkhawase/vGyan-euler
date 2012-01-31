package main;

import java.math.BigInteger;
import java.util.HashMap;

public class EvenFibo {

	private static HashMap<Integer, BigInteger> memory = new HashMap<Integer, BigInteger>();
	
	
	public static void main(String[] args) {
		
	}

	private static BigInteger fib(int i) {
		//
		if (i < 2)
			return BigInteger.ONE;

		// from memory
		if (memory.containsKey(i))
			return memory.get(i);

		// result
		if (memory.get(i) == null)
			memory.put(i, fib(i - 1).add(fib(i - 2)));

		return memory.get(i);

	}
}
