package linklist;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
	@Override
	public String toString() {		
		return print(this);
	}

	public static String print(ListNode node) {
		StringBuilder stringData = new StringBuilder();
		while (node != null) {
			stringData.append(node.val);
			node = node.next;
			if (node != null) {
				stringData.append("->");
			}
		}
		return stringData.toString();
	}
	
	public static int length(ListNode node) {
		int counter = 0;
		while (node != null) {
			node = node.next;
			counter++;
		}
		return counter;
	}

	public static ListNode reverseListNode(ListNode head) {
		if(head == null) return null;
		
		ListNode prev = null;
		ListNode cur = head;
		ListNode next = null;	
					
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}		
		
		return prev;
	}
}
