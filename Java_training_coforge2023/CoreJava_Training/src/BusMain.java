
public class BusMain {
	
	public static void main(String[] args) {
		
		Bus bus1 = new Bus(803240, "Intercity Jal-DLI", "Jalandhar to New Delhi", 570.25f);
		Bus bus2 = new Bus(792450, "Intercity Noida-DLI", "Noida to New Delhi", 60.00f);
		
		bus1.busInfo();
		bus2.busInfo();
		
		Bus bus3 = bus2;
		bus3.busInfo();
		
		bus3.setBusId(432845);
		bus3.setBusName("PUNBUS");
		bus3.setBusRoute("Jalandhar to Patiala");
		bus3.setBusFare(185.00f);
		
		bus3.busInfo();
		bus2.busInfo();
	}
	
}
