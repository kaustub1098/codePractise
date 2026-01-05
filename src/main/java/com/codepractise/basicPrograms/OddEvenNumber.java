package com.codepractise.basicPrograms;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		int num =10;
		
		if(num%2==0) {
			System.out.println("it is even number");
			mainBitwiseAnd(args);
		}
		else {
			System.out.println("it is odd number");
		}
	}
	
	
	public static void mainBitwiseAnd(String[] args) {

		int num=102;
		boolean isEven =(num & 1)==0;
		System.out.println(num+(isEven?" is even " : " is odd"));
	}
}
