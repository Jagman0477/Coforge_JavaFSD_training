package com.coforge.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
		
		Integer ar[] = {2,45,8,6,4,2,1243,6,7};
		List<Integer> l1 = new ArrayList(Arrays.asList(ar));
		
		// Streaming Integer array
		l1.stream().forEach(a -> System.out.print(a+", "));
		System.out.println("");
		
		// Streaming Integer array and limiting the results
		l1.stream().limit(3).forEach(a -> System.out.print(a+", "));
		System.out.println("");
		
		// Filtering only even numbers
		l1.stream().filter(a -> a%2 == 0).forEach(a -> System.out.print(a+", "));
		System.out.println("");
		
		// Mapping squares of keys
		l1.stream().map(a -> a*a).forEach(a -> System.out.print(a+", "));
		System.out.println("");
		
		// Mapping squares of keys and filtering them also using distinct
		l1.stream().map(a -> a*a).filter(a -> a%2 == 0).distinct().forEach(a -> System.out.print(a+", "));
		
	}
	
}
