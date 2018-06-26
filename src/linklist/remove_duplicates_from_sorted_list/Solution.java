package linklist.remove_duplicates_from_sorted_list;

import linklist.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode A) {
		ListNode cur = A;
		ListNode next = null;
		while(cur != null && cur.next != null) {
			if(cur.val == cur.next.val) {
				next = cur.next.next;
				cur.next = next;				
			}else {
				cur = cur.next;
			}
		}
		
		return A;
	}
}