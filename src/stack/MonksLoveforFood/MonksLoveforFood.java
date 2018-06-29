package stack.MonksLoveforFood;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MonksLoveforFood {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream(
				"C:\\Users\\ramshank1\\git\\PracticeByPractice\\src\\stack\\MonksLoveforFood\\sample-input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nQ = Integer.parseInt(br.readLine());

		Stack<Integer> pile = new Stack<Integer>();

		for (int i = 0; i < nQ; i++) {
			int[] row  = Arrays.stream(br.readLine().split("\\D+"))
				       .filter(word -> !word.isEmpty())
				       .mapToInt(Integer::parseInt)
				       .toArray();
			int q = row[0];
			
			if(q == 1) {
				if(pile.isEmpty()) {
					System.out.println("No Food");
				}else {
					System.out.println(pile.pop());
				}
			}else if(q == 2) {				
				pile.push(row[1]);
				
			}
		}

	}
	
	
}
