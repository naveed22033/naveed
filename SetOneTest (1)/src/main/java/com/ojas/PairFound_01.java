package com.ojas;

public class PairFound_01 {

	public static void pairs(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target)

					System.out.println("The pair is: " + arr[i] + " " + arr[j]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 5, 3, 1 };
		pairs(arr, 10);
	}

}
