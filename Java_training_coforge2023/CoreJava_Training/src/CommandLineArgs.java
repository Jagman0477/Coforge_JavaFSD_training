
public class CommandLineArgs {

	public static void main(String[] args) {
		
		// Running directly from cmd using command -> 'java [classname] value1 value2 ..' use in bin folder to use class file
		// else  use with file extension from src folder.
		System.out.println("id "+ args[0]);
		System.out.println("name "+ args[1]);
		
	}
	
}
