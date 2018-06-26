package stack;

import java.util.Arrays;



public class ArrayStack<E> implements Stack<E>{
	private E [] data ;
	
	private int DEFAULT_CAPACITY = 10;
	
	int top = -1;
	@SuppressWarnings("unchecked")
	public ArrayStack(){
		data = (E[]) new Object[DEFAULT_CAPACITY];
	}
	
	public ArrayStack(int capacity ){
		data = (E[]) new Object[capacity];
	}
	
	
	@Override
	public int size() {
		
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		if(size() > 0) {
			return false;
		}		
		return true;
	}

	@Override
	public void push(E e) {	
		
		if(size() == data.length) throw new IllegalStateException("Stack Full Eception");
		top++;
		data[top] = e;
	}

	@Override
	public E pop() {
		if(size() <= 0) throw new IllegalStateException("Stack Empty Eception");
		E item = data[top];
		data[top] = null;
		top--;
		return item;
	}

	@Override
	public E top() {
		if(size() <= 0) throw new IllegalStateException("Stack Empty Eception");
		return data[top];
	}

	@Override
	public String toString() {

		return Arrays.toString(data);
	}
	
}
