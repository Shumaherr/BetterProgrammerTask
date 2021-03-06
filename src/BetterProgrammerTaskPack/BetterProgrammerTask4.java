package BetterProgrammerTaskPack;

public class BetterProgrammerTask4 {

	public static int countWaysToJump(int N) {
		/*
		 * A set of stairs has N steps. You can jump either 1 or 2 steps at a
		 * time. For example, if the stairs is N=4 steps, you can reach the end
		 * in 5 possible ways: 1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2 Please
		 * implement this method to return the count of the different ways to
		 * reach the end of the stairs with N steps.
		 */

		if (N > 0)

			return countWaysToJump(N - 1) + countWaysToJump(N - 2);
		else
			return 0;

	}
}
