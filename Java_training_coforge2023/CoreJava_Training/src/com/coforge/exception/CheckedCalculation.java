package com.coforge.exception;
import java.util.Scanner;

public class CheckedCalculation {



		static int division(int a, int b) throws Exception {
			if(b == 0)
				try {
					throw new Exception("Second no. is 0");
				}
			catch(Exception e){
				System.err.println("Error at method -> division = "+e.getMessage());
				throw e;
			}
				
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
			catch(Exception e) {
				System.err.println(e+":"+e.getMessage());
			}
			
			sc.close();
		
	}

	
}
