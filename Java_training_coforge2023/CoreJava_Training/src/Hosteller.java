import java.util.Scanner;

public class Hosteller extends Student1 {

	static Scanner sc = new Scanner(System.in);
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
}
