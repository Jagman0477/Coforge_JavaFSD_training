package com.mine.testing;

public class Test3 {
	 public static void main(String[] args) {
	        int n = 4; // Number of rows
	        
	        // Loop to iterate through each row
	        for (int i = n; i >= 0; i--) {
	            int num = i;
	            
	            // Loop to print numbers in each row
	            for (int j = n; j >= i; j--) {
	                System.out.print(num + " ");
	                num += j - n; // Calculate the next number
	            }
	            
	            System.out.println(); // Move to the next line after each row
	        }
	    }
}
