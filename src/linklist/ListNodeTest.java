package linklist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListNodeTest {

	@Test
	void testReverseListNode() {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		
		System.out.println(ListNode.print(list1));
		System.out.println(ListNode.print(ListNode.reverseListNode(list1)));
	}

}
