package linklist.remove_duplicates_from_sorted_list_ii;

import linklist.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode A) {
		ListNode cur = A;
		ListNode next = null;
		boolean isSame = false;
		while(cur != null && cur.next != null) {
			if(cur.val == cur.next.val) {
				next = cur.next.next;
				cur.next = next;
				isSame = true;
			}else {				
				cur = cur.next;
				if(isSame) {
					A = cur;
					isSame  = false;
				}
			}
		}
		
		return A;
	}
}
