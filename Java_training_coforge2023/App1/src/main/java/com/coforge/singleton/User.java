package com.coforge.singleton;

public class User {

	// this is a singleton class
	private User() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private static  User user;
	
	public static User getUser() {
		if(user == null)
			user = new User();
		return user;
	}
	
}
