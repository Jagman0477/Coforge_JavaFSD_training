import java.util.Scanner;

public class TicketMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ticket t1 = new Ticket();
		
		System.out.println("Enter no. of bookings: ");
		int bookings = sc.nextInt();
		t1.setBookings(bookings);
		
		System.out.println("Enter no. of available tickets: ");
		int availableTickets = sc.nextInt();
		t1.setAvailableTickets(availableTickets);
		
		while(t1.getAvailableTickets()>0) {
			System.out.println("Enter the price: ");
			int price = sc.nextInt();
			t1.setPrice(price);
			
			System.out.println("Enter no. of Tickets: ");
			int tickets = sc.nextInt();
			int netPrice = t1.calculateNoOfTickets(tickets, t1);
			
			System.out.println("Enter ticket ID ");
			int ticketId = sc.nextInt();
			t1.setTicketId(ticketId);
			
			t1.ticketInfo(tickets, netPrice);
		}
		
	}
	
}
