
public class User {
	int userId;
	String userName;

	{
		System.out.println("This is called an init block - init block1");
	}
	{
		System.out.println("This is init block2");
	}
	{
		System.out.println("This is init block3");
		userId = 67;
		userName = "Pablo Tsucasa";
		System.out.println("Now calling constructor");
	}
	
	// Constructor
	User(){
		System.out.println("This is a constructor");
	}
	
	public void userInfo() {
		System.out.println("\tUser ID = "+ userId);
		System.out.println("\tUser name = "+ userName);
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		u1.userInfo();
	}
	
}
