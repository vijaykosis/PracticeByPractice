package linklist.merge_two_sorted_lists;

import static org.junit.Assert.assertEquals;

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
	void testMergeTwoLists() {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(5);
		
		ListNode list2 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(4);
		
		ListNode R = sol.mergeTwoLists(list1, list2);
		
		assertEquals("1->1->3->4->4->5", R.toString());
	
	}

}
