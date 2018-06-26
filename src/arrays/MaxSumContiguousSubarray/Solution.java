package arrays.MaxSumContiguousSubarray;

import java.util.List;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example:
 * 
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 * 
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * For this problem, return the maximum sum.
 * 
 * @author ramshank1
 *
 */
public class Solution {

	public int maxSubArray(final List<Integer> A) {

		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < A.size(); i++) {
			sum += A.get(i);
			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}