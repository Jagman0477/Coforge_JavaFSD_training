import java.util.Scanner;

public class StringPrg2 {

	public static void main(String[] args) {
		
		System.out.println("hello" == "hello");// 2 references in the same string pool to same value
		System.out.println("hello" == new String("hello"));//  2 references in string pool 
														   //  as different objects
		
		System.out.println("hello".equals(new String("hello"))); // 1 outside and 1 inside string pool
		
		System.out.println("hello" == (new Scanner(System.in).next()));
		// User input makes object putside string pool
		System.out.println("hello".equals((new Scanner(System.in).next())));
	}
	
}
