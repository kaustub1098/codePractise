package com.codepractise.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class duplicateElementsIntergeres {

	public static void main(String[] args) {
//		List: ordered, allows duplicates; examples: ArrayList, LinkedList.
//
//		Set: unique elements only; examples: HashSet, LinkedHashSet, TreeSet.
//
//		Map: key-value pairs with unique keys; examples: HashMap, LinkedHashMap, TreeMap.
//
//		Queue / Deque: used for processing elements in order, especially FIFO or double-ended operations.
//
//		Common use cases
//		Use a List when order matters and duplicates are allowed.
//
//		Use a Set when uniqueness matters.
//
//		Use a Map when you need fast lookup by key, like rollNo -> studentName.
		
		 System.out.println("//repeat numbers we use set");
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,200,32,15);
		 
		 Set<Integer> set = new HashSet<>();
		 
		 myList.stream()
		 .filter(i-> !set.add(i))
		 .forEach(System.out::println);
		 
		 System.out.println("//distinct values");
		 
		 
		List<Integer>list= myList.stream().distinct().collect(Collectors.toList());
	    list.forEach(System.out::println);
	    
	    System.out.println("//first element of list using stream function");
	    
	    
	    myList.stream().findFirst()
	    .ifPresent(System.out::println);
	    
	    System.out.println("total number of elements present in the list using Stream functions");
	    long count =myList.stream().count();
	    System.out.println(count);
	    
	    
	    System.out.println("maximum value element present in it using Stream functions--");
	    
	    int max = myList.stream().max(Integer::compare).get();
	    System.out.println(max);
	    
	    
	}

}
