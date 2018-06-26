package linklist.remove_duplicates_from_sorted_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import linklist.ListNode;

class SolutionTest {
	Solution sol;
	@BeforeEach
	void setUp() throws Exception {
		sol = new Solution();
	}

	@Test
	void testDeleteDuplicates() {
		ListNode A = new ListNode(1);
		A.next = new ListNode(1);
		A.next.next = new ListNode(2);
		A.next.next = new ListNode(2);
		A.next.next = new ListNode(2);
		A.next.next = new ListNode(3);
		A.next.next = new ListNode(4);
		ListNode R = sol.deleteDuplicates(A);
		assertEquals("1->3", R.toString());
	}
	
	

}
