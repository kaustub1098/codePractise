package com.codepractise.streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sortStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		System.out.println("Sort ascdning");
		
		myList.stream()
		.sorted()  //ascnding sort
		.forEach(System.out::println);
		
		
		System.out.println("Descending sort");
		myList.stream()
		.sorted(Collections.reverseOrder())  //ascnding sort
		.forEach(System.out::println);
		
		
		System.out.println("Return true false is any repeat value appear");
		Set< Integer> set1= new HashSet<>();
		
		Boolean flag= myList.stream()
		.anyMatch(i-> !set1.add(i));
	    System.out.println(flag);
	
	}

}
