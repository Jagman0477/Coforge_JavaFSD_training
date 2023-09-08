package com.coforge.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPrg2 {

	public static void main(String[] args) {
		
		Map<Integer, String> emp3 = new HashMap<>(); // Legacy implementation no support for null keys
		
		emp3.put(4365, "Jaisankar Kharbanda");
		emp3.put(9821, "Banarsi Bhaijaan");
		emp3.put(5467, "Mahesh Chandrayan");
		emp3.put(4365, "Jaisankar Kharbanda");
		emp3.put(3561, "Birju Bhurjiwala"); 
		
		// Using entry set to get values from the hashmap both key and values at the same time
		Set<Entry<Integer, String>> entrySet = emp3.entrySet();
		
		for(Entry<Integer, String> e: entrySet) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		Collection<String> values = emp3.values();
		Collection<Integer> keys = emp3.keySet();
		System.out.println(keys);
		System.out.println(values);
	}
	
}
