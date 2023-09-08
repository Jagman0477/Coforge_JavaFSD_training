package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.coforge.exception.User;

public class ListExample1 {

	public static void main(String[] args) {
		
		Collection arr = new ArrayList();
		arr.add(23456);
		arr.add(new Integer(23587));
		arr.add(243.123f);
		arr.add("Delhi");
		
		arr.add(new User());
		System.out.println(arr.contains(23587));
		arr.remove(23587);
		System.out.println(arr.contains(23587));
		System.out.println(arr.contains("Delhi"));
		System.out.println(arr);
		
		List l1 = new ArrayList();
		l1.add("hello");
		l1.add(235.29f);
		l1.add(55.9);
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		
		for(Object o: l1) {
			System.out.println(o);
		}
	}
	
}
