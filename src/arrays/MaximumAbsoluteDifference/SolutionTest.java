package arrays.MaximumAbsoluteDifference;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution ;
	
	@BeforeEach
	void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	void testMaxArr() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,3,-1));
		int expected = 5;
		int actual = solution.maxArr(A);		
		assertEquals(expected, actual);
		
	}

}
