package com.coforge.bean;

/**
 * 
 * 	@author Training
 *	Ipse maine kaam kiya hai 
 */	

public class User {

	private int userId;
	private String userName;
	private float userSalary;
	
	public void init() {
		this.userId = 23435;
		this.userName = "Dilshan Pingla";
		this.userSalary = 21342.34f;
		System.out.println("Init called");
	}
	
	public void destroy() {
		System.out.println("Destroy called");
	}
	
	public User(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}	
	
}
