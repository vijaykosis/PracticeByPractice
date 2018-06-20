package arrays.MinStepsInInfiniteGrid;

import java.util.ArrayList;

public class Solution {
	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		int minimum = 0;
		for (int i = 1; i < A.size(); i++) {
			int maxX = A.get(i) - A.get(i - 1);
			int maxY = B.get(i) - B.get(i - 1);
			minimum += Math.max(Math.abs(maxX),Math.abs(maxY));			
		}
		return minimum;
    }
}
