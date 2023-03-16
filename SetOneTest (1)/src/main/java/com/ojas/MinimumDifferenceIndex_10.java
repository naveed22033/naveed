package com.ojas;

public class MinimumDifferenceIndex_10 {

	public static int minimumefference(int [] arr, int num1, int num2) {		
		int a=arr.length;
		int num1_index=a;
		int num2_index=a;
		int min_diff = Integer.MAX_VALUE;
		
		for(int i=0;i<a;i++) {
			if(arr[i]==num1) {
				num1_index=i;
				if (num2_index != a) {
					min_diff = Integer.min(min_diff, Math.abs(num1_index - num2_index));
			}
			
			}
			if(arr[i]==num2) {
				num2_index=i;
				if(num2_index!=a) {
					min_diff=Integer.min(min_diff, Math.abs(num1_index-num2_index));
				}
				
			}
		}
		return min_diff;
	}
	
	public static void main(String[] args) {
		int [] arr = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
		int num1 = 3, num2 = 2;
		int differenceIndex = minimumefference(arr, num1, num2);
		System.out.println("The Minimum difference index is : " + differenceIndex);
	}

}
