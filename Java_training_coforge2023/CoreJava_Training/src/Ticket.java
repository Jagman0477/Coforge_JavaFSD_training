
public class Ticket {

	private int ticketId;
	private int bookings;
	private int price;
	private static int availableTickets;
	
	public int getBookings() {
		return bookings;
	}
	public void setBookings(int bookings) {
		this.bookings = bookings;
	}	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets<=0)
			System.out.println("Enter a valid number of tickets");
		else
			Ticket.availableTickets = availableTickets;
	}
	
	public int calculateNoOfTickets(int noOfTickets, Ticket t1) {
		int availableTickets = t1.getAvailableTickets();
		if(noOfTickets <= availableTickets) {
			setAvailableTickets(availableTickets - noOfTickets);
			setBookings(getBookings()+noOfTickets);
			int price = noOfTickets*t1.getPrice();
			return price;
		} else {
			System.out.println("Requested no of tickets are not available.");
		}
			
		return -1;
	}
	
	void ticketInfo(int noOfTickets, int netPrice) {
		
		System.out.println("\tNo. of bookings: "+getBookings());
		System.out.println("\tNo. of available tickets: "+getAvailableTickets());
		System.out.println("\tNo. of tickets: "+noOfTickets);
		System.out.println("\tTcket ID: "+getTicketId());
		System.out.println("\tNet price: "+netPrice);
	}
	
}
