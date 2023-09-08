
public class Wrapper {

	public static void main(String[] args) {
		
		int a = 3;
		Integer n = new Integer(3);// Boxing
		
		System.out.println(n);
		
		int q = n.intValue();// Unboxing
		
		System.out.println(q);
		
		System.out.println(n+3);// Auto boxing
		
		
		//String to int
		
		String s = "33";
		
		System.out.println(Integer.parseInt(s)+4);
		
		//To string 
		
		Long l = 23456778865435L;
		String s1 = l.toString();
		System.out.println(s1+"S");
		
		Integer VO = Integer.valueOf("559");
		System.out.println(VO);
		
		System.out.println(Character.isDigit('1'));// Check if char is a digit i.e numeric
		System.out.println(Character.isAlphabetic('a'));// Check if char is a Alphabetic i.e a,b,c,...
		
		if(!Character.isLetterOrDigit('$'))
			System.out.println("It is a special character");

	}
	
}
