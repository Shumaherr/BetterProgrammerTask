package BetterProgrammerTaskPack;

import java.util.*;

public class BetterProgrammerTask3 {

	// Please do not change this interface
	public static interface Node {
		int getValue();

		List<Node> getChildren();
	}

	public static double getAverage(Node root) {
		/*
		 * Please implement this method to return the average of all node values
		 * (Node.getValue()) in the tree.
		 */
		Stack<Node> s = new Stack<Node>();
		int num = 0;
		int sum = 0;
		s.add(root);
		while (!s.isEmpty()) {
			Node n = s.pop();
			num++;
			sum += n.getValue();
			for (Node temp : n.getChildren()) {
				s.push(temp);
			}
		}
		return sum/num;
	}

}