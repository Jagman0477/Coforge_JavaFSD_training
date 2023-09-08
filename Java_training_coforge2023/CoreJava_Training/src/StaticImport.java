import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(PI);// We can do this because we static imported all math classes 
		out.println(E);// We can use this 'cause we static imported system class
		out.println(sin(PI/2));
		
	}
	
}
