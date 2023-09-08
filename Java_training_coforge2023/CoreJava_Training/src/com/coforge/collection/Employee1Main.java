package com.coforge.collection;

import java.util.Arrays;

public class Employee1Main {

	public static void main(String[] args) {
		
		Employee1[] e = new Employee1[3];
		e[0] = new Employee1(11101, "Gajodhar Ganjedi", 34000);
		e[1] = new Employee1(11103, "Chandan Charasi", 32000);
		e[2] = new Employee1(11102, "Tajendra Tambakuwala", 30000);
		
		System.out.println("Unsorted result: ");
		System.out.println(Arrays.toString(e));
		
		Arrays.sort(e);
		
		System.out.println("Sorted Result: ");
		System.out.println(Arrays.toString(e));
	}
	
}
