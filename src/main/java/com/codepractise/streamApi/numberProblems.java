package com.codepractise.streamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class numberProblems {

	public static void main (String args[]) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
		list.stream()
		.filter(n -> n%2 ==0)
		.forEach(System.out::println);  //even number
		
		
		list.stream()
		.map(s->s+"")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);   //repeatitive number
		
	
		
	}
}
