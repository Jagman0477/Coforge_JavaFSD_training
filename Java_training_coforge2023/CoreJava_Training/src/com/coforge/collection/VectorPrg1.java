package com.coforge.collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorPrg1 {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<>();
		
		System.out.println("Initail size of vector: "+v1.size()); //0
		System.out.println("Initial vector capacity: "+v1.capacity()); //10
		
		for(int i=0; i<10; i++) {
			v1.add(i+20);
		}
		
		v1.add(20+20);
		
		System.out.println("Current size: "+v1.size()); //11
		System.out.println("Current capacity: "+v1.capacity()); //20
		
		System.out.println(v1+"\n");
		
		ListIterator<Integer> iter = v1.listIterator();
		
		System.out.println("Normal now: ");
		
		while(iter.hasNext()) {			
			System.out.print(iter.next()+", ");
		}
		
		System.out.println("\nReverse now: ");
	
		while(iter.hasPrevious()) {			
			System.out.print(iter.previous()+", ");
		}
	}
	
}
