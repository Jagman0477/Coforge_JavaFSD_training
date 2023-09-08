
public class Palindrome {

	public static void main(String[] args) {
		
		String s1 = "racecar";
		char[] ch1 = s1.toCharArray();
		char[] p1 = new char[ch1.length];
		
		int j = 0;
		
		for(int i = ch1.length-1; i >= 0; i--) {
			p1[i] = ch1[j++];
		}
		
		String s2 = new String(p1);
		
		if(s1.equals(s2))
			System.out.println("Its a palindrome");
		else 
			System.out.println("Its not a palindrome");
	}
	
}
