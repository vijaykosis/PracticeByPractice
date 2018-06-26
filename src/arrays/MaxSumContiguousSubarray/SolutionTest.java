package arrays.MaxSumContiguousSubarray;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}


	@Test
	void testMaxSubArray() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4));
		int expected = 6;
		int actual = solution.maxSubArray(A);
		assertEquals(expected, actual);
	}

}
