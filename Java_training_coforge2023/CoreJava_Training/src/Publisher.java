
public class Publisher {

	private int publisherId;
	private String publisherName;
	private String publisherBooks[];
	private float bookCost[];
	
	public Publisher(int publisherId, String publisherName, String[] publisherBooks, float[] bookCost) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherBooks = publisherBooks;
		this.bookCost = bookCost;
	}
	
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String[] getPublisherBooks() {
		return publisherBooks;
	}
	public void setPublisherBooks(String[] publisherBooks) {
		this.publisherBooks = publisherBooks;
	}
	public float[] getBookCost() {
		return bookCost;
	}
	public void setBookCost(float[] bookCost) {
		this.bookCost = bookCost;
	}
	
	
}
