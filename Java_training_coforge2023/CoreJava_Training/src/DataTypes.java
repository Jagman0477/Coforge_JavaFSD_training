
public class DataTypes {
	public static void main(String[] args) {
		
		System.out.println(10.0/0); // gives result cause double
		
		System.out.println(10.0f/0); // gives result cause float

//		System.out.println(10/0); // doesn't give result cause integer 
		
		// Casting data types
		
		int i = 5678;
		System.out.println((float) i);
		
		float j = 5623.13224f;
		System.out.println((int) j);

		float p =  47823.748f;
		long m = 5269164736234434l;
		double q = p;
		System.out.println(q);
		System.out.println((double) p);
		System.out.println(m);
		System.out.println((int)m);

	}
}
