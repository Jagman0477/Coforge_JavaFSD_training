
import java.util.Scanner;

public class Author {

	static Scanner sc = new Scanner(System.in);
	
	private int authorId;
	private String authorName;
	
//	private final String country = "India"; Creating a final variable similar to js const
	private final String country; // Other method to create a final variable
	
	Author(){
		country = sc.next();
		authorId = 1234;
		authorName = "Priyesh Khanna";
	}
	
	public static void main(String[] args) {
		
		Author a1 = new Author();
		
//		a1.country = "India"; can't change a final variable
		System.out.println(a1.country);
		System.out.println(a1.authorId);
		System.out.println(a1.authorName);
		
	}
	
}
