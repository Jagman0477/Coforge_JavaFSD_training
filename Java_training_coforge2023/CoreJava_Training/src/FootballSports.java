
public class FootballSports extends Sports{
	
	private String location;
	private int teamMemberCount;

	public FootballSports() {
		
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTeamMemberCount() {
		return teamMemberCount;
	}

	public void setTeamMemberCount(int teamMemberCount) {
		this.teamMemberCount = teamMemberCount;
	}

	void info() {// Using this function to call old function as overriding a final function is not possible
		sportsInfo();
		System.out.println("\tLocation = "+location);
		System.out.println("\tTeam member count = "+teamMemberCount);
	}
	
	//	@Override
	//	void sportsInfo() {
	//		// Can't override final method
	//	}
	
	@Override
	void welcome() {
		System.out.println("Welcome to Football!");
	}
	
	public static void main(String[] args) {
		
		FootballSports f1 = new FootballSports();
		f1.setId(724);
		f1.setName("Football");
		f1.setLocation("Georgia");
		f1.setTeamMemberCount(11);
		f1.info();
		
	}
	
}
