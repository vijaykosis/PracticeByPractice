package linklist.palindrome_list;

import linklist.ListNode;

public class Solution {
	public int lPalin(ListNode A) {
		int length = ListNode.length(A);
		ListNode aNextHalfhead = A;
		for (int i = 0; i < length / 2 ; i++) {
			aNextHalfhead = aNextHalfhead.next;
		}
		
		ListNode reversed = ListNode.reverseListNode(aNextHalfhead);
		
		while(A != null && reversed != null) {
			if(A.val  != reversed.val) {				
				return 0;
			}
			A = A.next;
			reversed = reversed.next;
		}		
		return 1;
	}
	
	
	
}
