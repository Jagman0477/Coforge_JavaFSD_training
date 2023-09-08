import java.util.Scanner;

public class EmployeeDetails {

	
	public static Employees getEmployeeDetails() {
		
		
		Employees e2 = new Employees();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String empName = sc.nextLine();
		System.out.println("Enter employee id");
		int empId = sc.nextInt();
		System.out.println("Enter employee PF percentage");
		int empPF = sc.nextInt();
		System.out.println("Enter employee salary");
		Double empSalary = sc.nextDouble();
		
		e2.setPfPercentage(empPF);
		e2.setEmployeeId(empId);
		e2.setEmployeeName(empName);
		e2.setSalary(empSalary);
		e2.calculateNetSalary(empPF);
		
		return e2;
	}
	
	public static void PrintEmployeeDetails(Employees E){
		
		System.out.println("Employee details: ");
		System.out.println("\tEmployee ID: "+ E.getEmployeeId());
		System.out.println("\tEmployee name: "+ E.getEmployeeName());
		System.out.println("\tEmployee salary: "+ E.getSalary());
		System.out.println("\tEmployee PF percentage: " + E.getPfPercentage());
		System.out.println("\tEmployee net salary: "+ E.getNetSalary());
		
	}
		
	public static void main(String[] args) {
		
		Employees E = new Employees();
		E = getEmployeeDetails();
		
		PrintEmployeeDetails(E);
		
	}
	
}
