package com.coforge.exception;

import java.util.Scanner;

public class CandidateMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Candidate getCandidateDetails() {
		
		Candidate c1 = new Candidate();
		
		try {
			System.out.println("Enter candidate name: ");
			c1.setName(sc.next());
			System.out.println("Enter candidate gender: ");
			c1.setGender(sc.next());
			System.out.println("Enter candidate salary: ");
			c1.setExpectedSalary(sc.nextFloat());
		} catch(InvalidSalaryException e) {
			System.err.println(e.getMessage());
			return null;
		}
			
		return c1;
	}

	public static void main(String[] args) {
		
		if(getCandidateDetails()!=null)
			System.out.println("Registration successfull.");
		
	}
	
}
