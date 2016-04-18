package BetterProgrammerTaskPack;

import java.util.Set;
import java.util.TreeSet;

public class BetterProgrammerTask2 {

	public static int countPowerfulNumbers(int from, int to) {
		/*
		 * A powerful number is a positive integer m that for every prime number
		 * p dividing m, p*p also divides m.
		 * 
		 * (a prime number (or a prime) is a natural number that has exactly two
		 * (distinct) natural number divisors, which are 1 and the prime number
		 * itself, the first prime numbers are: 2, 3, 5, 7, 11, 13, ...)
		 * 
		 * The first powerful numbers are: 1, 4, 8, 9, 16, 25, 27, 32, 36, ...
		 * 
		 * Please implement this method to return the count of powerful numbers
		 * in the range [from..to] inclusively.
		 */
		Set<Integer> resultSet = new TreeSet<Integer>();
		int maxSqr = (int) Math.sqrt(to);
		int maxCube = (int) Math.pow(to, 1.0 / 3) + 1;

		for (int candidate1 = 1; candidate1 < maxSqr; candidate1++)
			for (int candidate2 = 1; candidate2 < maxCube; candidate2++) {
				int result = candidate1 * candidate1 * candidate2 * candidate2 * candidate2;

				if ((result != 1) && (result >= from) && (result <= to))
					resultSet.add(result);
			}
		return resultSet.size();
	}
}