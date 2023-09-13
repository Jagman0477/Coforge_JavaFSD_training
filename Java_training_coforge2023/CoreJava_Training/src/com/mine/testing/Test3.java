package com.mine.testing;

public class Test3 {

	public static long solution(int a, int b) {
	
		long sum = 1;
		
		for(long i = 1; i<b; i++) {
			sum += i;
		}
		
		long counter = sum+1;
		
		for(long i = 1; i<a; i++, counter++) {
			sum += counter;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		long res = solution(4,1);
		System.out.println(res);
		
	}
	
}
