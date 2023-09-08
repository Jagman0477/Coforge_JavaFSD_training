
public class Laptop extends Computer {

	private String OS;
	private String hardDiskSize;
	private String ramSize;
	
	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public String getRamSize() {
		return ramSize;
	}                                                                                                                

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	
	
	@Override
	public void getComputerInfo(){	// This function is getting overridden from parent class
		
		// Can't have weaker access modifier than parent class in case of overriding,  but can have higher
		
		super.getComputerInfo();
		
		System.out.println("Hard disk: "+getHardDiskSize());
		System.out.println("OS: "+getOS());
		System.out.println("Ram size: "+getRamSize());
		
	}

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		Computer c1 = new Computer();
		l1.setComputerId(456789);
		l1.setComputerModel("Alienware");
		l1.setComputerCost(110000f);
		l1.setHardDiskSize("512 GB");
		l1.setOS("Windows");
		l1.setRamSize("8 GB");
		
		l1.getComputerInfo();
		System.out.println("\n");
		c1.getComputerInfo();
		
	}
	
}
