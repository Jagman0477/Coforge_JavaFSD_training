package com.coforge.collection;

interface Hello{
	void show();
}

public class Anonymous {
	
	public static void main(String[] args) {
		//This is an anonymous class
		Hello h1 = new Hello() {
			@Override
			public void show() {
				System.out.println("Hlo");
			}
			
		};
		h1.show();
	}

}
