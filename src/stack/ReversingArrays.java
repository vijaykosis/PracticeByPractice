package stack;

import java.util.Arrays;

public class ReversingArrays {

	public static void main(String[] args) {
		Integer[] a = { 4, 8, 15, 16, 23, 42 };
		String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));
		System.out.println("Reversing...");
		reverse(a);
		reverse(s);
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));

	}

	private static <E> void reverse(E[] e) {
		Stack<E> st = new ArrayStack<E>(e.length);
		for (int i = 0; i < e.length; i++) {
			st.push(e[i]);
		}
		for (int i = 0; i < e.length; i++) {
			e[i] = st.pop();
		}
	}

}
