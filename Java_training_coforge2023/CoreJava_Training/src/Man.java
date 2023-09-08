
public class Man {

	void behaviour() {
		System.out.println("Man");
	}
	
}

class Brother extends Man{
	@Override
	void behaviour() {
		System.out.println("Brother");
	}
}

class coforgeEmployee extends Man{
	@Override
	void behaviour() {
		System.out.println("Coforge employee");
	}
}