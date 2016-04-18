package BetterProgrammerTaskPack;

public class BetterProgrammerTask1 {

	public static Object[] reverseArray(Object[] a) {

		/*
		 * Please implement this method to return a new array where the order of
		 * elements has been reversed from the original array.
		 */

		for (int i = 0; i < a.length/2; i++) {
			Object temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
		return a;
	}
}