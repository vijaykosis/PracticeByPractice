package arrays.MinStepsInInfiniteGrid;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
 * @author ramshank1
 *
 */
class SolutionTest {
	private Solution solution;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	void testCoverPoints() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0,1,1));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0,1,2));
		int expected = 2;
		int actual = solution.coverPoints(A, B);
		assertEquals(expected, actual);
	}

}
