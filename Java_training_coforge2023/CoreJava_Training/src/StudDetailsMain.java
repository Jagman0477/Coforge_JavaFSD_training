import java.util.Scanner;

public class StudDetailsMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter student ID: ");
		int sId = sc.nextInt();
		
		System.out.println("Enter student name: ");
		String sName = sc.next();
		
		System.out.println("Enter student address: ");
		String sAddress = sc.next();
		
		System.out.println("Enter Yes/yes if student belong to NIT, NO/no if from another college :");
		String collegeTemp = sc.next();
		
		if(collegeTemp.equals("YES") || collegeTemp.equals("yes") || collegeTemp.equals("NO") || collegeTemp.equals("no")) {
			
			if(collegeTemp.equals("YES") || collegeTemp.equals("yes")) {
				StudDetail s1 = new StudDetail(sId, sName, sAddress);
				
				System.out.println("\tStudent details: ");
				System.out.println("\tStudent ID: "+ s1.getStudentId());
				System.out.println("\tStudent name: "+ s1.getStudentName());
				System.out.println("\tStudent address: "+ s1.getStudentAddress());
				System.out.println("\tStudent college name: "+ s1.getCollegeName());
				
			} else if(collegeTemp.equals("NO") || collegeTemp.equals("no")) {
				
				System.out.println("Enter college name: ");
				String sCollegeName = sc.next();
				
				StudDetail s1 = new StudDetail(sId, sName, sAddress, sCollegeName);
				
				System.out.println("\tStudent details: ");
				System.out.println("\tStudent ID: "+ s1.getStudentId());
				System.out.println("\tStudent name: "+ s1.getStudentName());
				System.out.println("\tStudent address: "+ s1.getStudentAddress());
				System.out.println("\tStudent college name: "+ s1.getCollegeName());
			}
			
		} else {
			
			while(!collegeTemp.equals("YES") || !collegeTemp.equals("yes") || !collegeTemp.equals("NO") || !collegeTemp.equals("no")) {
			
				System.out.println("Wrong input, re-enter input");
				System.out.println("\tEnter Yes/yes if student belong to NIT, NO/no if from another college :");
				collegeTemp = sc.next();
				
			}
		}
		
		
	}
	
}
