package com.coforge.singleton;

public class UserMain {

	public static void main(String[] args) {
		
		//User u1 = new User(); not possible for singleton class as constructor is private
		User u1 = User.getUser();
		
		u1.setId(1001);
		u1.setName("Mahesh Bhatt");
		
		User u2 = User.getUser();
		
		u2.setId(1002);
		u2.setName("Mahesh Kulkarni");
		
		System.out.println(u1.getId()+"\t"+u1.getName());
		System.out.println(u2.getId()+"\t"+u2.getName());
		
		//Both are same since they point to the same object that is static in nature
	}
	
}
