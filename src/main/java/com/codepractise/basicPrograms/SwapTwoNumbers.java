package com.codepractise.basicPrograms;

public class SwapTwoNumbers {

	//using arithmatic sum & difference
	public static void main(String[] args) {
		int m = 9;
		int n=5;
		System.out.println("Before Swapping M: "+m+" n: "+n);
		
		m=m+n;
		n=m-n;
		m=m-n;
		
		System.out.println("After Swapping M: "+m+" n: "+n);
		main2(args);
	}
	
	//using a function and  reflect change outside
	
	public static void main2(String[] args) {
		System.out.println("using a function and  reflect change outside");
		int []nums = {9,5};
		
		System.out.println("Before Swapping M: "+nums[0]+" n: "+nums[1]);
		
		swapArray(nums);
		
		System.out.println("After Swapping M: "+nums[0]+" n: "+nums[1]);
	}
	
	public static void swapArray(int[]arr) {
		
		int temp =arr[0];
		
		arr[0]=arr[1];
		arr[1]=temp;
	}
}
