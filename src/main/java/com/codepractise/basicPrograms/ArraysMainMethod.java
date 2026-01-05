package com.codepractise.basicPrograms;

import java.util.Arrays;

public class ArraysMainMethod {

	public static void main(String[] args) {
		System.out.println("Hello main 1");
		String single[];
		single=new String[2];
		single[0]="A1";
		single[1]="A2";
		main2(single);
	}
	
	public static void main2(String[] args) {
		for(String arg:args) {
		System.out.println(arg);
	}
		}
}
