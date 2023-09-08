package com.coforge.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(324);
		l1.add(235);
		l1.add(0357);
		l1.add(982);
		l1.add(123);
		l1.add(908);
		l1.add(673);
		
		l1.remove(0);
		System.out.println(l1);
		
		LinkedList<Integer> l2 = new LinkedList<>(l1); 
		System.out.println(l2);
		l2.remove(); // removes first element -> remove and remove first are the same
		System.out.println(l2);

		l2.add(314); // adds to end of the list
		l2.addFirst(780);
		System.out.println(l2);
		
		l2.addLast(666); // add and addLast are the same
		System.out.println(l2);
		
		System.out.println(l2.get(4));
	}
	
}
