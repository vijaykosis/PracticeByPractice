package linklist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testLinkListtoStringTest() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals("1->2->3->4->5", list.toString());
	}

	@Test
	void testLinkListLength() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(5, list.getLength());
	}

	@Test
	void testLinkListAddToTop() {
		LinkedList list = new LinkedList(1);
		list.addTop(2);
		list.addTop(3);
		list.addTop(4);
		list.addTop(5);
		assertEquals("5->4->3->2->1", list.toString());
	}

	@Test
	void testAddByIndex() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6, 0);
		assertEquals("6->1->2->3->4->5", list.toString());
	}

	@Test
	void testAddByIndexinMiddel() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6, 3);
		assertEquals("1->2->3->6->4->5", list.toString());
	}

	@Test
	void testAddByIndexinLast() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6, 5);
		assertEquals("1->2->3->4->5->6", list.toString());
	}

	@Test
	void testAddByIndexinOutofBoundLast() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	    assertThrows(ArrayIndexOutOfBoundsException.class,()->{list.add(6,7); } );
	}
	@Test
	void testAddByIndexinOutofBoundFirst() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	    assertThrows(ArrayIndexOutOfBoundsException.class,()->{list.add(6,-1); } );
	}
	
	@Test
	void testRemoveFirst() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);	
		list.removefirst();
		assertEquals("2->3->4->5", list.toString());
	}
	
	@Test
	void testRemoveLast() {
		LinkedList list = new LinkedList(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);	
		list.removeLast();
		assertEquals("1->2->3->4", list.toString());
	}
	
	@Test
	void testLinkListAsStack() {
		LinkedList list = new LinkedList(1);
		list.add(2, 0);
		list.add(3, 0);
		list.add(4, 0);
		list.removefirst();
		assertEquals("3->2->1", list.toString());
	}
	
}
