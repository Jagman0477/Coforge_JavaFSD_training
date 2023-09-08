package com.coforge.exception;

import java.util.Scanner;

public class UserMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter user data: ");
		
		User u1 = new User();
		
		try {
			System.out.println("Enter user ID: ");
			u1.setUserId(sc.nextInt());
			System.out.println("Enter user name: ");
			u1.setUserName(sc.next());
			System.out.println("Enter user salary: ");
			u1.setUserSalary(sc.nextFloat());	
			u1.userinfo();
		} catch(UserException e) {
			System.err.println(e);
		}
		
	}
}
