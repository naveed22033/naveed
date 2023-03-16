package com.ojas;

import java.util.Arrays;

public class SwapAnArray2elements_07 {

	public static void swaparray(int arr[]) {
		
		
		int temp[]= new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp[i]=arr[i];
					arr[i]=arr[j];
					arr[j]=temp[i];
				}	
				
			}
			System.out.println(Arrays.toString(arr));
			
		}
	}
	
	public static void main(String[] args) {
	
		int[] arr= {3, 8, 6, 7, 5, 9};
		
		swaparray(arr);
	}

}
