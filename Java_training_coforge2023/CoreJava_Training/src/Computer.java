
public class Computer {

	protected  int computerId;
	protected String computerModel;
	protected float computerCost;
	
	public int getComputerId() {
		return computerId;
	}
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	public String getComputerModel() {
		return computerModel;
	}
	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}
	public float getComputerCost() {
		return computerCost;
	}
	public void setComputerCost(float computerCost) {
		this.computerCost = computerCost;
	}
	
	public void getComputerInfo() {
		
		System.out.println("Computer details: ");
		System.out.println("Computer ID: "+getComputerId());
		System.out.println("Computer model: "+getComputerModel());
		System.out.println("Computer cost: "+getComputerCost());
		
	}
	
}
