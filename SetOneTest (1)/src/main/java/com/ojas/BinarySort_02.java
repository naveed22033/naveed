package com.ojas;

import java.util.Arrays;

public class BinarySort_02 {

	public static void binarysort(int arr[]) {
		int temp = 0;
		for (int value : arr) {
			if (value == 0)
				arr[temp++] = 0;
		}
		for (int i = temp; i < arr.length; i++) {
			arr[temp++] = 1;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 1, 0, 0, 1 };
		binarysort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
