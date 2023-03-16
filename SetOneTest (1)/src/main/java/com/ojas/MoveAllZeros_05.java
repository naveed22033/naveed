package com.ojas;

import java.util.Arrays;

public class MoveAllZeros_05 {

	public static   int[] movezerostoend(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
int arr[]={ 6, 0, 8, 2, 3, 0, 4, 0, 1 };
System.out.print(Arrays.toString(movezerostoend(arr)));

	}

}
