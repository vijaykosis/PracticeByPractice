package arrays.PrintArrayinReverse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintArrayinReverse {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream(
				"C:\\Users\\ramshank1\\git\\PracticeByPractice\\src\\arrays\\PrintArrayinReverse\\sample-input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String el = br.readLine();
		int noOfElements = Integer.parseInt(el);
		int a[] = new int[noOfElements];
		
		for (int i = 0; i < a.length; i++) {
			el = br.readLine();
			a[i] = Integer.parseInt(el);
		}
		a = reverse(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	

	public static int[] reverse(int a[]) {		
		int temp;
		for(int i = 0, j = a.length-1 ; i< j ; i++,j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}	
		return a;
	}
}
