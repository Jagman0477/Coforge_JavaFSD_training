
public class Employees {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private int pfPercentage;
	private Double netSalary;
	
	
	public void setPfPercentage(int pfPercentage) {
		this.pfPercentage = pfPercentage;
	}
	public int getEmployeeId() {
		return this. employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return this.netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public int getPfPercentage() {
		return this.pfPercentage;
	}
	
	
	public void calculateNetSalary(int pfPercentage) {
		double salary1 = getSalary();
		double pfValue = salary1*pfPercentage/100;
		setNetSalary(salary1-pfValue);
	}
	
}
