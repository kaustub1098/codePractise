package com.codepractise.streamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPIAdvanceQuestions {

	
	public static void main(String[] args) {
		
		List<String>list1 = Arrays.asList("Java","8");
		
		List<String> list2 = Arrays.asList("explained","through","programs");
		
		Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
		System.out.println("Concat 2 streams ->");
		concatStream.forEach(str-> System.out.print(str+" "));
		
		
		
		System.out.println("/////////////////###############");/////////////////////
		
		System.out.println("Perform cube on list elements and filter numbers greater than 50 ->");
	
		List<Integer> integerlist = Arrays.asList(4,5,6,7,8,9,1,2,3);
		
		integerlist.stream()
		.map(i-> i*i*i)
		.filter(i->i>50)
		.forEach(System.out::println);
	
		
		System.out.println("/////////to sort an array and then convert the sorted array into Stream");

	      int arr[] = { 99, 55, 203, 99, 4, 91 };
	      
	      Arrays.parallelSort(arr); //uses multiple threads for sorting.
	      Arrays.sort(arr); //is the normal single-thread sort.
	      
	      Arrays.stream(arr)
	      .forEach(System.out::println);
	      
	//      System.out.println("https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062");
	
	      
	      System.out.println("////////////use map to convert object into Uppercase in Java 8");
	      
	      List<String> nameLst = Arrays.asList("hello world");
	      
	      System.out.println( nameLst.stream()
	      .map(String::toUpperCase)
	      .collect(Collectors.toList()));
	      
	      
	      
	      System.out.println("////////// convert a List of objects into a Map by considering duplicated keys and store them in sorted order?");
	      List<Notes> noteLst = new ArrayList<>();
	      noteLst.add(new Notes(1, "note1", 11));
	      noteLst.add(new Notes(1, "note1", 11));
	      noteLst.add(new Notes(2, "note2", 22));
	      noteLst.add(new Notes(3, "note3", 33));
	      noteLst.add(new Notes(4, "note4", 44));
	      noteLst.add(new Notes(5, "note5", 55));
	      
	      Map<String,Integer> notesMap = noteLst.stream()
	    		  .sorted(Comparator.comparingInt(Notes::getCount).reversed())
	    				  .collect(Collectors.toMap(Notes::getName, Notes::getCount,(oldValue,newValue)-> oldValue,LinkedHashMap::new));
	      
	      System.out.println("Notes : "+notesMap);
	      
	      
	      System.out.println("/////count each element/word from the String ArrayList in Java8?//////");
	      
	      List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
	      
	      System.out.println(names.stream()
	    		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	      
	      
	      System.out.println("find only duplicate elements with its count from the String ArrayList in Java8");
	      
	      List<String> names2 = Arrays.asList("AA", "BB", "AA", "CC");
	      
	     names2.stream()
	    		 .filter(name -> Collections.frequency(names2, name)>1)
	    		 .distinct()
	    		 .forEach(System.out::println);
	     
	     System.out.println("check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object");
	     List<String> myList = Arrays.asList("Apple", "Banana", "Cherry");
	     
	     Optional.ofNullable(myList)
	     .filter(list->!list.isEmpty())
	     .ifPresent(list->list.forEach(System.out::println));
	     ;
	 
	     
	     System.out.println("Program to find the Maximum element in an array");
	      int arr2[] = { 99, 55, 203, 99, 4, 91 };
	      
	      System.out.println(Arrays.stream(arr2).max().getAsInt());
	      
	      
	      System.out.println("count the occurrences of each character in a String.");
	      String input = "programming";
	      
	      Map<Character,Long> charCount = 
	    		  input.chars()
	    		  .mapToObj(c->(char)c)
	    		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	      
	      charCount.forEach((character,count) -> System.out.println(character +":"+count));
	      
	      
	      
	}
	
}
