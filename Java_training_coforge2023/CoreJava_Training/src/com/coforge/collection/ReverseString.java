package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseString implements Comparator<String>{

	public static void main(String[] args) {
		
		String arr1[] = {"book", "pen", "pencil", "bag", "watter bottle", "gear box"};
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); 
	
		System.out.println("Sort in reverse order.");
		Arrays.sort(arr1, new ReverseString());
		System.out.println(Arrays.toString(arr1));
		
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}