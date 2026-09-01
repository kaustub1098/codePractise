package com.codepractise.dsa;

import java.util.Arrays;

public class ArraysPractise {

	int arr[] = {10, 5, 10};
	
	private static int secondLargest (int[]arr) {
		
		if (arr==null || arr.length<2) {
			return -1;
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length-2;i>=0 ; i--) {
			if (arr[i]!=arr[arr.length-1]) return arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,12,12,0,1};
		
		System.out.println("second largest element - "+secondLargest(arr));
	}
	
}
