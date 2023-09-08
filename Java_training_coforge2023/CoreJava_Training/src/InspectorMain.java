
public class InspectorMain {

	public static void main(String[] args) {
		
		Inspector i2 = new Inspector(678, "Manav", 5000);
		
		System.out.println("Inspector information: ");
		System.out.println("\tInspector ID: "+ i2.iId);
		System.out.println("\tInspector state: "+ Inspector.state);
		System.out.println("\tInspector country: "+ Inspector.country);
		
		i2.inspectorInfo();
		
		System.out.println("\n\t"+Math.E);
		System.out.println("\t"+Math.PI);
		System.out.println("\t"+Math.PI/5);
		
	}
	
}
