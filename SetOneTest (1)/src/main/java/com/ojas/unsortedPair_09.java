package com.ojas;

import java.util.Arrays;

public class unsortedPair_09 {

	public static void unsortedpair(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] - arr[i] == target || arr[i] - arr[j] == target)

					System.out.println("pair found  (" + (arr[i] + "," + arr[j]) + ")");

			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 2, 2, 5, 5, 4 };
		int k = 3;
		int[] temp = Arrays.stream(arr).distinct().toArray();
		unsortedpair(temp, k);
	}

}
