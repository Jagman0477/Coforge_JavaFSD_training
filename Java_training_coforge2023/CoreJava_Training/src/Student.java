
public class Student {

	int roll;
	String name;
	
	// Parameterized constructor
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	// Default constructor
	Student(){
		name = "Default";
		roll = 0;
	}
	
	void studentInfo(){
		System.out.println("Student information: ");
		System.out.println("\tStudent roll no : "+ roll);
		System.out.println("\tStudent name : "+name);
	}
	
	
	
	public static void main(String[] args) {
		
	// Creating an object from the class Student using s1 as a reference variable
	// s1 here is a reference variable, referencing the object
		Student s1 = new Student();
		
	//	System.out.println("\troll "+s1.roll);
	//	System.out.println("\tname "+s1.name);
		
		s1.roll = 435;
		s1.name = "Mahesh Chatterji";
		
	//	System.out.println("\troll "+s1.roll);
	//	System.out.println("\tname "+s1.name);
		
	// Changing parameter value
		s1.studentInfo();
		
		System.out.println();
		
	// Overloaded Constructor
		Student s2 = new Student(456, "Mahendra Bahubali");
		s2.studentInfo();
		
		System.out.println();
		
	// Default Constructor
		Student s3 = new Student();
		s3.studentInfo();
	
		
	// Creating an array of objects
		Student student[] = new Student[3];
		
		student[0] = new Student();
		student[1] = new Student(23, "Malhan Manty");
		student[2] = new Student(62, "Zameer Ali");

		for(Student st: student) {
			st.studentInfo();;
		}
		
	}

}
