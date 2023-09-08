package com.coforge.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPrg1 {

	public static void main(String[] args) {
		
		System.out.println("For HashMap : \n");
		
		HashMap<Integer, String> emp = new HashMap<>();
		
		emp.put(4365, "Jaisankar Kharbanda");
		emp.put(9821, "Banarsi Bhaijaan");
		emp.put(5467, "Mahesh Chandrayan");
		emp.put(4365, "Jaisankar Kharbanda"); // Can't have duplicate key's
		emp.put(null, "Bittu Badmash");
		emp.put(null, "Bittu Badmash"); // Can have only one null key
		emp.put(3561, null); // Can have multiple null values
		emp.put(4009, null);
		
		System.out.println(emp);
		System.out.println(emp.size());
		
		Set<Integer> keySet = emp.keySet();
		for(Integer i: keySet) {
			System.out.print(i+" -> "+emp.get(i)+", ");
		}
		
		System.out.println("\n\n");
		System.out.println("For HashTable : \n");
		
		Map<Integer, String> emp2 = new Hashtable<>(); // Legacy implementation no support for null keys or values
		
		emp2.put(4365, "Jaisankar Kharbanda");
		emp2.put(9821, "Banarsi Bhaijaan");
		emp2.put(5467, "Mahesh Chandrayan");
		emp2.put(4365, "Jaisankar Kharbanda"); // Can't have duplicate key's
//		emp2.put(null, "Bittu Badmash"); // Can't have null keys in hashtable 
//		emp2.put(3561, null); // Can't have null values in hashtable 
		
		System.out.println(emp2);
		System.out.println(emp2.size());
		
		Set<Integer> keySet2 = emp2.keySet();
		for(Integer i: keySet2) {
			System.out.print(i+" -> "+emp2.get(i)+", ");
		}
		
		System.out.println("\n\n");
		System.out.println("For TreeMap : \n");
		
		Map<Integer, String> emp3 = new TreeMap<>(); // Legacy implementation no support for null keys
		
		emp3.put(4365, "Jaisankar Kharbanda");
		emp3.put(9821, "Banarsi Bhaijaan");
		emp3.put(5467, "Mahesh Chandrayan");
		emp3.put(4365, "Jaisankar Kharbanda"); // Can't have duplicate key's
//		emp3.put(null, "Bittu Badmash"); // Can't have null keys in treeMap 
		emp3.put(3561, null); 
		
		System.out.println(emp3);
		System.out.println(emp3.size());
		
		Set<Integer> keySet3 = emp2.keySet();
		for(Integer i: keySet3) {
			System.out.print(i+" -> "+emp3.get(i)+", ");
		}
		
	}
	
}
