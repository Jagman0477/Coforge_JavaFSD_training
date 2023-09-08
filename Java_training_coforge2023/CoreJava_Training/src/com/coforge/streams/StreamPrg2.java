package com.coforge.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrg2 {

	public static void main(String[] args) {
		
		Integer ar[] = {2,45,8,6,4,2,1243,6,7,7};
		List<Integer> l1 = new ArrayList(Arrays.asList(ar));
		
		System.out.println(l1.stream().sorted().distinct().count());
		
		System.out.println("\nTo skip: ");
		System.out.println(l1.stream().sorted().skip(4).collect(Collectors.toList()));
		System.out.println(l1.stream().sorted().skip(4).collect(Collectors.toSet()));
		
	}
	
}
