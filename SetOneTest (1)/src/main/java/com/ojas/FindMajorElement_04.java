package com.ojas;

public class FindMajorElement_04 {

	public static void findMajorElement(int[] array) {
		int count = 1;
		int element = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					element = array[i];
					break;
				}
			}
		}
		if (count > array.length / 2) {
			System.out.println("The major element : " + element);
		}
		System.out.println("The major elements occurence : " + count);
	}

	public static void main(String[] args) {
		
		int[] array = { 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2 };
		
		findMajorElement(array);

	}

}
