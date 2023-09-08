package com.coforge.collection;

import java.util.Arrays;

public class ArrayPrg1 {

	public static void main(String[] args) {
		
		int ar[] = {11,2,3,4,7,9,8,0,55};
		int ar2[] = {11,2,3,4,7,9,8,0,55};
		
		System.out.println(Arrays.toString(ar).equals(Arrays.toString(ar2)));
		
		System.out.println(ar.toString() == ar2.toString());
		
		System.out.println(Arrays.equals(ar, ar2));
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		int res = Arrays.binarySearch(ar, 7);
		if(res<0)
			System.out.println("Element not found.");
		else 
			System.out.println("Result = "+res);
		
	}
	
}
