// Constructor with inheritance

class X{

	public X() {
		super();
		System.out.println("X constructor");
	}
	
}

class Y extends X{
	
	public Y() {
		super();
		System.out.println("Y constructor");
	}
	
}

public class Z extends Y{

	public Z() {
		super();
		System.out.println("Z constructor");
	}
	
	public static void main(String[] args) {
		
		new Z();
		
	}
	
}
