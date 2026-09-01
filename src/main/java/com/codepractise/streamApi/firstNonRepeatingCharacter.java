package com.codepractise.streamApi;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatingCharacter {
	public static void main (String args[]) {
		
	//scalable solution
	String name = "swiss";
	
	Character results= name.chars()
	.mapToObj(c->(char)c)
	.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	.entrySet()
	.stream().filter(entry -> entry.getValue()==1)
	.map(Map.Entry::getKey)
	.findFirst()
	.orElse(null);
	
	System.out.println(results);
	
	
	//simple solution but take times for large chars
	String name2 = "swiss";
	
	Character result2= name2.chars()
			.mapToObj(c->(char)c)
			.filter(ch->name2.indexOf(ch)==name2.lastIndexOf(ch))
			//.findFirst()
            .reduce((first,second)->second)
			.orElse(null);
	
	System.out.println(result2);
	
	
	System.out.println("First non repeating character");
	
	String input = "banana";
	
	
	
	Character result3= input.chars()
			.mapToObj(c->(char)c)
	        .filter(ch-> input.indexOf(ch) == input.lastIndexOf(ch))
	        .findFirst()
	        .orElse(null);
	
	System.out.println(result3);
	
	
	System.out.println("first repeated character");
	

	
	Set<Character> firstREpChar = new HashSet<>();
	
    Character result4 = input.chars()
	.mapToObj(c->(char)c)
	.filter(c->!firstREpChar.add(c))
	.findFirst()
	.orElse(null);
	
	System.out.println(result4);
	
	
	
	
	}
}
