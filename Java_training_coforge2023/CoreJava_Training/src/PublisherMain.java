import java.util.Scanner;

public class PublisherMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter publisher ID: ");
		int pId = sc.nextInt();
		
		System.out.println("Enter publisher name: ");
		String pName = sc.next();
		
		System.out.println("Enter no of books by the publisher: ");
		int pBooksNo = sc.nextInt();
		
		String bName[] = new String[pBooksNo];
		float bCost[] = new float[pBooksNo];
		
		for(int i = 0; i < pBooksNo; i++) {
			System.out.println("Enter book name and cost: ");
			bName[i] = sc.next();
			bCost[i] = sc.nextFloat();
		}
		
		Publisher p1 = new Publisher(pId, pName, bName, bCost);
		
		System.out.println("\nPublisher information: ");
		System.out.println("\tPublisher ID: "+ p1.getPublisherId());
		System.out.println("\tPublisher name: "+ p1.getPublisherName());
		System.out.println("\n\tBooks: ");
		for(String book : p1.getPublisherBooks()) {
			System.out.println("\t\t"+book);
		}
		System.out.println("\n\tCost: ");
		for(float cost : p1.getBookCost()){
			System.out.println("\t\t"+cost);
		}
	}
	
}
