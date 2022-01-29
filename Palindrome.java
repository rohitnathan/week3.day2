package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Madam";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
			// System.out.println(reverse);
		}
		if (s.equalsIgnoreCase(reverse)) {
			System.out.println(s + " is a palindrome");
		}

		else {
			System.out.println("Not a Palindrome");
		}

	}
	// Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam"
	 * 
	 * b) Declare another String rev value as "" c) Iterate over the String in
	 * reverse order d) Add the char into rev e) Compare the original String with
	 * the reversed String, if it is same then print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */

}
