package com.ojas;

import java.util.Arrays;

public class MaxProductIntegr_03 {

	public static void maxproduct(int[]arr) {
		int maxproduct=Integer.MIN_VALUE;
		int max1=-1;
		int max2=-1;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(maxproduct<arr[i]*arr[j]) {
					maxproduct=arr[i]*arr[j];
					max1=i;
					max2=j;
				}
			}
			
		}
		System.out.println("pair is"+" "+arr[max1]+","+arr[max2]);
		System.out.println("maximum product is"+arr[max1]*arr[max2]);
		
	}
	
	public static void main(String[] args) {
		int arr[]={-10, -3, 5, 6, -2};
		maxproduct(arr);

	}

}
