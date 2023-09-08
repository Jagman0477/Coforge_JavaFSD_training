
public  class Vehical {

	private String vehicalNumber;
	private String vehicalName;
	private String vehicalType;
	private double vehicalPrice;
	
	public Vehical(String vehicalNumber, String vehicalName, String vehicalType, double vehicalPrice) {
		super();
		this.vehicalNumber = vehicalNumber;
		this.vehicalName = vehicalName;
		this.vehicalType = vehicalType;
		this.vehicalPrice = vehicalPrice;
	}

	public String getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public String getVehicalName() {
		return vehicalName;
	}

	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public double getVehicalPrice() {
		return vehicalPrice;
	}

	public void setVehicalPrice(double vehicalPrice) {
		this.vehicalPrice = vehicalPrice;
	}
	
	public interface Loan{
		
		double issueLoan();
		
	}
	
	public interface Insurance{
		
		double takeInsurance();
		
	}
	
}

