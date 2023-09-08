
public class Sports {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void welcome() {
		System.out.println("Welcome method");
	}
	
	final void sportsInfo() {	
		System.out.println("Sports Info: ");
		System.out.println("\tSports ID. = "+getId());
		System.out.println("\tSports name = "+getName());
	}
	
}
