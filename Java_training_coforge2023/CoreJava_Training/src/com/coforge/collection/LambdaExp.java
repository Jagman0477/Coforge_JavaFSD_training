package com.coforge.collection;

public class LambdaExp {

	interface Hello{
		void show();
		default void show2() {
			System.out.println("Yo");
		};
	}
	
	interface Addition{
		int add(int a, int b);
	}
		
		public static void main(String[] args) {
			// Lambda function must use a functional interface i.e. interface with only one function
			Hello h1 = () -> System.out.println("Hello"); // This is a lambda function
			
			h1.show();
			h1.show2();
			
			Addition addition = (p,q) -> p+q;
			
			System.out.println(addition.add(20, 500000));
			
		}

}
