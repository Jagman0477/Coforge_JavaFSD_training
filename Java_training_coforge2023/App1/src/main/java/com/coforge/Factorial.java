package com.coforge;

public class Factorial {

	public static long fact(int a) {
		if(a == 1 || a == 0)
			return 1;
		return a*fact(a-1);
	
	}
	
}
