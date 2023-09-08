package com.coforge.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CityList {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Ludhiana");
		l1.add("Jalandhar");
		l1.add("Amritsar");
		l1.add("Patiala");
		l1.add("Mohali");
		l1.add("Rajpura");
		l1.add("Sirhind");
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		System.out.println("\nUsing iterator: \n");
		Iterator<String> i1 = l1.iterator();
		
		while(i1.hasNext()) {
			String s = i1.next();
			if(s.equals("Rajpura"))
				continue;
			System.out.print(s+", ");
		}
		
		System.out.println("\n"+l1);
		
	}
	
}
