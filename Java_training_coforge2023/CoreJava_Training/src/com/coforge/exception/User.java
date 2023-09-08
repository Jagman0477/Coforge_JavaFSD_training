package com.coforge.exception;

public class User {

	private int userId;
	private String userName;
	private float userSalary;
	
	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws UserException{
		if(userId<=0) 
			throw new UserException("User id is 0 or -ve");
		else if(userId<1000 || userId>10000)
			throw new UserException("User id value not in range 1000 - 10000");
		else 
			this.userId = userId;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws UserException {
		if(userName.isBlank())
			throw new UserException("Username can't be empty.");
		else if(userName.length()<5 || userName.length()>15)
			throw new UserException("Username length not in range 5 - 15");
		else
			this.userName = userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) throws UserException{
		if(userSalary <= 0)
			throw new UserException("User salary can't be 0 or -ve.");
		else
			this.userSalary = userSalary;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}
	
	void userinfo() {
		System.out.println("User information: ");
		System.out.println("\tUser Id: "+userId);
		System.out.println("\tUser name: "+userName);
		System.out.println("\tUser salary: "+userSalary);
	}
	
	
}
