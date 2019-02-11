package programs;

import java.security.PublicKey;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IsPalindrome("madama");
	}
	public static void IsPalindrome(String s){
		
		StringBuffer sb = new StringBuffer(s);
		if(sb.reverse().toString().equals(s))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
