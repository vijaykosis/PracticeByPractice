package com.test;

public class Test {

	public static void main(String args[]) {
		int arr[] = { 7, 2, 3, 1, 2, 3, 1, 6, 2, 3 };
		int size = arr.length;
		int k = 3;
		System.err.println(calculateMaxSumLength(arr, size, k));
		

	}

	static int calculateMaxSumLength(int arr[], int n, int k) {
		int ans = 0, count = 0, f = 0;
		for (int i = 0; i < n;) {
			count = 0;
			f = 0;
			while (i < n && arr[i] <= k) {
				count++;
				if (arr[i] == k)
					f = 1;
				i++;
			}

			if (f == 1)
				ans += count;
			while (i < n && arr[i] > k)
				i++;
		}
		return ans;
	}
}