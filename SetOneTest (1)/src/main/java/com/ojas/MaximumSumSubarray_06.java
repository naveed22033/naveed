package com.ojas;

public class MaximumSumSubarray_06 {

	public static int SubArray(int[] arr) {

			int max = 0;
			int maxend = 0;
			for (int i : arr) {
				maxend = maxend + i;
				maxend = Integer.max(maxend, 0);
				max = Integer.max(max, maxend);
			}
			return max;
		}
		public static void main(String[] args) {
			int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

			System.out.println("The sum of  subarray with the " + "largest sum is " + SubArray(arr));
		}

}
