import java.util.Scanner;

public class AssociateMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter associate ID: ");
		int associateId = sc.nextInt();
		
		System.out.println("Enter associate name: ");
		String associateName = sc.next();
		
		System.out.println("Enter associate working days: ");
		int workingDays = sc.nextInt();
		
		Associate a1 = new Associate(associateId, associateName, workingDays);
		
		System.out.println("\nThe associate "+a1.getAssociateName()+"'s work status: "+ a1.getWorkStatus());
	}
	
}
