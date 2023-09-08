
public class VehicalMain extends Vehical implements Loan, Insurance{

	public VehicalMain(String vehicalNumber, String vehicalName, String vehicalType, double vehicalPrice) {
		super(vehicalNumber, vehicalName, vehicalType, vehicalPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double takeInsurance() {
		if(getVehicalPrice()<=150000)
			return 3500d;
		else if(getVehicalPrice()<=300000)
			return 4000d;
		else if(getVehicalPrice()>300000)
			return 5000d; 
		
		return 0;
	}

	@Override
	public double issueLoan() {
		if(getVehicalType().equals("4 wheeler"))
			return getVehicalPrice()*0.8;	
		else if(getVehicalType().equals("3 wheeler"))
			return getVehicalPrice()*0.75;	
		else if(getVehicalType().equals("2 wheeler"))
			return getVehicalPrice()*0.5;
		
		return 0;
	}

	public static void main(String[] args) {
		
		VehicalMain v1 = new VehicalMain("PB0867BH79", "Scorpio", "4 wheeler", 1200000);
		
		System.out.println("Vehical details: ");
		System.out.println("\tVehical number: "+v1.getVehicalNumber());
		System.out.println("\tVehical name: "+v1.getVehicalName());
		System.out.println("\tVehical type: "+v1.getVehicalType());
		System.out.println("\tVehical price: "+v1.getVehicalPrice());
		System.out.println("\tVehical loan amount: "+v1.issueLoan());
		System.out.println("\tVehical insurance amount: "+v1.takeInsurance());
	}
	
	
}
