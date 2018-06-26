package arrays.addOneTonumber;

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
	void testPlusOne() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2,4));
		
		ArrayList<Integer> R = solution.plusOne(A);
		
		assertArrayEquals(B.toArray(), R.toArray());
	}
	
   @Test
	void testPlusOne1() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9,9,9));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,0,0,0));
		
		ArrayList<Integer> R = solution.plusOne(A);
		System.out.println(R);
		assertArrayEquals(B.toArray(), R.toArray());
	}
	
	@Test
	void testPlusOne2() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9,0,0,0,9,9,9));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(9,0,0,1,0,0,0));
		
		ArrayList<Integer> R = solution.plusOne(A);
		
		assertArrayEquals(B.toArray(), R.toArray());
	}
	
	@Test
	void testPlusOne3() {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,0,0));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,0,1));
		
		ArrayList<Integer> R = solution.plusOne(A);
		
		assertArrayEquals(B.toArray(), R.toArray());
	}
	
}
