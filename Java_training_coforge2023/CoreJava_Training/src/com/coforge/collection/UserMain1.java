package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class UserMain1 {

	public static void main(String[] args) {
		
		User[] u1 = new User[] {
				new User(11101, "Gajodhar Ganjedi", 34000),
				new User(11103, "Chandan Charasi", 32000),
				new User(11102, "Tajendra Tambakuwala", 30000)
		};
		
		Arrays.sort(u1, new Comparator<User>() {
			
			@Override
			public int compare(User o1, User o2) {
				return Float.valueOf(o1.getUserSalary()).compareTo(Float.valueOf(o2.getUserSalary()));
			}
		});
		
		System.out.println("Sorted by Salary: ");
		System.out.println(Arrays.toString(u1));
		
		Arrays.sort(u1, (a, b) -> {
			return Integer.valueOf(a.getUserId()).compareTo(Integer.valueOf(b.getUserId()));
		});
		
		System.out.println("Sorted by ID: ");
		System.out.println(Arrays.toString(u1));
		
		System.out.println("Sorted by name: ");
		Stream.of(u1).sorted((a, b) -> {
			return (a.getUserName()).compareTo((b.getUserName()));
		}).forEach(a -> System.out.println(a.getUserId()+"\t"+a.getUserName()+"\t"+a.getUserSalary()));
		
	}
	
}
