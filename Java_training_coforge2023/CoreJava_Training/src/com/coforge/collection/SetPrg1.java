package com.coforge.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// No duplicates allowed in all kinds of sets

public class SetPrg1 {

	public static void main(String[] args) {
		
		Set<String> s1 = new LinkedHashSet<>(); //ordered
			// TreeHashSet sorted
			// HashSet NORMAL
		
		s1.add("Peepoo");
		s1.add("tootoo");
		s1.add("tintin");
		s1.add("tuntun");
		s1.add("bopbop");
		s1.add("ponpon");
		s1.add("ponpon");
		
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) { // can use foreach as well
			System.out.print(i1.next()+", "); //Insame order as input
		}
		
		System.out.println("");
		
		Set<String> s2 = new HashSet<>();
		
		s2.add("Peepoo");
		s2.add("tootoo");
		s2.add("tintin");
		s2.add("tuntun");
		s2.add("bopbop");
		s2.add("ponpon");
		
		System.out.println(s2); // can't use index to get value and is in different order than input 
	}
	
}
