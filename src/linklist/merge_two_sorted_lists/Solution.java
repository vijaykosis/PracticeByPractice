package linklist.merge_two_sorted_lists;

import linklist.ListNode;

public class Solution {
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		ListNode head = null; 
		
		while(A != null && B != null) {
			if( A.val == B.val) {
				if(head == null) {
					head = A;
				}
				A.next = B;
				A = A.next;
				B = B.next;
			}else if(A.val > B.val) {
				
			} 
		}
		
		return head;
	}
}
