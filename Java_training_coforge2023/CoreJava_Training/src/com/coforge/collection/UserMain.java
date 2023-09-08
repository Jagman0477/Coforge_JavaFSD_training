package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

public class UserMain {

	public static void main(String[] args) {
		
		User[] u1 = new User[] {
				new User(11101, "Gajodhar Ganjedi", 34000),
				new User(11103, "Chandan Charasi", 32000),
				new User(11102, "Tajendra Tambakuwala", 30000)
		};
		
		System.out.println("Sort by ID: ");
		Arrays.sort(u1, new CompareById());
		System.out.println(Arrays.toString(u1));
		
		System.out.println("Sort by salary: ");
		Arrays.sort(u1, new CompareBySalary());
		System.out.println(Arrays.toString(u1));
	}
	
}

class CompareById  implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.getUserId() > o2.getUserId())
			return 1;
		else if(o2.getUserId()>o1.getUserId())
			return -1;
		else 
			return 0;
	}
	
}

class CompareBySalary  implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return Float.valueOf(o1.getUserSalary()).compareTo(Float.valueOf(o2.getUserSalary()));
	}
	
}