
public class StringPrg1 {

	public static void main(String[] args) {
		
		String s = "Hello";
		System.out.println(s);
		
		// All the changes don't happen on the main variable
		s.concat(" world.");
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim().length());
		
		System.out.println("");
		
		// Both reference to same string as they are in string pool
		String s1 = "qwertyuiop";
		String s2 = "qwertyuiop";
		
		// Not creating in string pool
		String s3 = new String("qwertyuiop");
		
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		
		s1 = s1.concat(s2);
		// Become different references in string pool as now they have different values
		System.out.println(s1+"   "+s2);
		System.out.println(s1==s2);
	}
	
}
