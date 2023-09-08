
public class ManMain {

	public static void main(String[] args) {
		
		Man m;
		
		// Dynamic binding
		m = new Brother();
		m.behaviour();
		
		m = new coforgeEmployee();
		m.behaviour();
		
	}
	
}
