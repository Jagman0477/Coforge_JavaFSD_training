import java.util.Scanner;

public class Student1Main {
	
	static Scanner sc = new Scanner(System.in);
	
public static Hosteller getHostellerDetails() {
		
		Hosteller h1 = new Hosteller();
		
		System.out.println("Enter student ID: ");
//		int sId = sc.nextInt();
		h1.setStudentId(sc.nextInt());
		
		System.out.println("Enter student Name: ");
//		String sName = sc.next();
		h1.setStudentName(sc.next());
		
		System.out.println("Enter student department ID: ");
//		int departmentId = sc.nextInt();
		h1.setDepartmentId(sc.nextInt());
		
		System.out.println("Enter student gender: ");
//		String sGender = sc.next();
		h1.setStudentGender(sc.next());
		
		System.out.println("Enter student phone number: ");
//		String sPhone = sc.next();
		h1.setStudentPhoneNumber(sc.next());
		
		System.out.println("Enter student hostel name: ");
//		String hostelName = sc.next();
		h1.setHostelName(sc.next());
		
		System.out.println("Enter student room number: ");
//		int roomNo = sc.nextInt();
		h1.setRoomNumber(sc.nextInt());
		
		return h1;
	}
	
	public static void main(String[] args) {
		
		Hosteller h2 = getHostellerDetails();
		
		System.out.println("Student details: ");
		System.out.println("\tStudent ID: "+h2.getStudentId());
		System.out.println("\tStudent name: "+h2.getStudentName());
		System.out.println("\tStudent department ID: "+h2.getDepartmentId());
		System.out.println("\tStudent gender: "+h2.getStudentGender());
		System.out.println("\tStudent phone number: "+h2.getStudentPhoneNumber());
		System.out.println("\tStudent hostel name: "+h2.getHostelName());
		System.out.println("\tStudent room number: "+h2.getRoomNumber());
		
		System.out.println("Do you want to modify phone number(Y/N): ");
		boolean updatePhone = sc.next().equals("Y");
		
		if(updatePhone) {
			System.out.println("Enter new room number: ");
			h2.setStudentPhoneNumber(sc.next());
		}
		
		System.out.println("Do you want to modify room number(Y/N): ");
		boolean updateRoom = sc.next().equals("Y");
		
		if(updateRoom) {
			System.out.println("Enter new room number: ");
			h2.setRoomNumber(sc.nextInt());
		}
		System.out.println("\tStudent phone number: "+h2.getStudentPhoneNumber());
		System.out.println("\tStudent hostel name: "+h2.getHostelName());
		
	}
	
}
