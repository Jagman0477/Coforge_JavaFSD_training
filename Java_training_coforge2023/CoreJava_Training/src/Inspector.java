
public class Inspector {

	int iId;
	String iName;
	float iSalary;
	
	static String state, country;// Class variables
	
	// Constructor is called for initialization of instance variable
	public Inspector(int id, String name, float salary) {
		
		System.out.println("Constructor is called.");
		
		this.iId = id;
		this.iName = name;
		this.iSalary = salary;
		
	}
	
	// Static block for initializing class variable
	static {
		System.out.println("\nThis is the static block");
		state = "Punjab";
		country = "India";
	}
	
	void inspectorInfo() {
		System.out.println("Inspector information: ");
		System.out.println("\tInspector ID: "+ iId);
		System.out.println("\tInspector name: "+ iName);
		System.out.println("\tInspector salary: "+ iSalary);
		System.out.println("\tInspector state: "+ state);
		System.out.println("\tInspector country: "+ country);

	}
	
	public static void main(String[] args) {
		Inspector i1 = new Inspector(567, "Jagmanjeet Singh", 30000);
		
		i1.inspectorInfo();
		
		System.out.println("\nClass variables can be called directly without object initialization -> "+state+", "+country);
	}
	
}
