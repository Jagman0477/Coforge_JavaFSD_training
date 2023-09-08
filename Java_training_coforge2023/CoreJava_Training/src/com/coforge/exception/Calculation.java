package com.coforge.exception;

import java.util.Scanner;

public class Calculation {

	static int division(int a, int b) {
		if(b == 0)
			throw new RuntimeException("Second no. is 0");
		else  
			return a/b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("No 1 = "+a);
		System.out.println("No 2 = "+b);
		try {
			System.out.println("Result = "+division(a,b));
		}
		catch(RuntimeException e) {
			System.err.println(e+":"+e.getMessage());
		}
		
		sc.close();
		
	}
	
}
