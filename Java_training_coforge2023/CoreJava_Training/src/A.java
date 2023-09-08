
class B {
	
	int x=100; 
	void show() {
		System.out.println("Class A show's this method");
		System.out.println("Class name = "+getClass().getName());
	}
	
}

public class A extends B{
	
	int x=1000;
	void show() {
		int x = 10000;
		System.out.println("Local x = "+x);
		System.out.println("This class x = "+this.x);// This shows current class reference
		System.out.println("Super class x = "+super.x);// super shows parent class reference
		super.show();
	}
	
	public static void main(String[] args) {
		new A().show();
	}
}