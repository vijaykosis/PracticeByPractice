package linklist.palindrome_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import linklist.ListNode;

class SolutionTest {
	private Solution sol;
	
	@BeforeEach
	void setUp() throws Exception {
		sol = new Solution();	
	}

	@Test
	void testLPalin() {
		ListNode A = new ListNode(1);
		A.next = new ListNode(2);
		A.next.next = new ListNode(1);
		int actual = sol.lPalin(A);
		
		assertEquals(1, actual);
	}

}
