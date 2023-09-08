package com.coforge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		String state[] = {"Punjab", "Uttar Pradesh", "Tamil Nadu", "Haryana"};
		
		List<String> l1 = new ArrayList<>(Arrays.asList(state));
		List<String> l2 = Arrays.asList(state); // can't .add() to this l2
		
		System.out.println("This is different its l2: \n"+l2);
		
		l1.add("Chhattisgarh");
		l1.add("Rajsthan");
		l1.add("Odissa");
//		l1.add(state[0]); Done with Arrays.asList() method
//		l1.add(state[1]);
//		l1.add(state[2]);
//		l1.add(state[3]);
// 		Collections also has reverse for list
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		System.out.println(Collections.binarySearch(l1, "Punjab"));
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
	
	}
	
}
