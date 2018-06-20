package arrays.addOneTonumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Given a non-negative number represented as an array of digits,
 * 
 * add 1 to the number ( increment the number represented by the digits ).
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * Example:
 * 
 * If the vector has [1, 2, 3]
 * 
 * the returned vector should be [1, 2, 4]
 * 
 * as 123 + 1 = 124
 * 
 * @author ramshank1
 *
 */
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int carry = 1;
		for (int i = A.size() -1 ; i >= 0 ; i--) {
			int digit = A.get(i);
						
			digit += carry;
			
			if(digit > 9) {
				stack.push(0);
				carry = 1;
			}else {
				stack.push(digit);
				carry = 0;
			}
			
		}
		if(carry != 0) {
			stack.push(carry);
		}
		
		while(!stack.isEmpty() && stack.peek() == 0) {
			stack.pop();
		}
		
		while(!stack.isEmpty()) {			
			result.add(stack.pop());
		}		
		return result;
	}
}
