package linklist;

public class LinkedList {
	private ListNode head;

	private ListNode tail;

	private int length;

	LinkedList(int data) {
		this.head = new ListNode(data);
		this.tail = head;
		length = 1;
	}

	public void add(int data) {
		ListNode node = new ListNode(data);
		tail.next = node;
		tail = node;
		length++;
	}
	
	public void addTop(int data) {
		ListNode node = new ListNode(data);
		node.next = head;
		head = node;
		length++;
	}
	
	public void add(int data, int index) {
		if(index < 0 || index > length) {
			throw new ArrayIndexOutOfBoundsException();
		}		
		ListNode node = new ListNode(data);
		ListNode prev = null;
		ListNode next = null;
		ListNode cur = head;
		while(index > 0 ) {
			prev = cur;
			cur = cur.next;
			index--;
		}
		if(prev == null) {
			node.next = head;
			head = node;
		}else {
			prev.next = node;
			node.next = cur;
			
		}
		length++;
	}
	/*
	 * public void remove(int data) { ListNode node = new ListNode(data); tail.next
	 * = node; length++; }
	 */

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public ListNode getTail() {
		return tail;
	}

	public void setTail(ListNode tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	private class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

	}

	@Override
	public String toString() {
		StringBuilder stringData = new StringBuilder();
		ListNode node = this.head;
		while (node != null) {			
			stringData.append(node.toString());
			node = node.next;
			if(node != null) {
				stringData.append("->");
			}
		}
		return stringData.toString();
	}
}
