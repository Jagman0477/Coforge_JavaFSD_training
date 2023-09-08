package com.coforge.collection;

public class OuterClass {

	int x = 90;
	
	private class Inner{
		int y =10; 
		
		public Inner(int y) {
			super();
			this.y = y;
		}

		void display() {
			System.out.println("X is = "+x);
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass o1 = new OuterClass();
		
		OuterClass.Inner i1 = o1.new Inner(20);
		
		System.out.println(i1.y);
		i1.display();
	}
	
}
