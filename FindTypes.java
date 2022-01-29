package week3.day2;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/*
		 * Pseudo Code: a) Convert the String to character array b) Traverse through
		 * each character (using loop) c) Find if the given character is what type using
		 * (if) i) Character.isLetter ii) Character.isDigit iii)Character.isSpaceChar
		 * iv) else -> consider as special character
		 */

		char[] charArray = test.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter = letter + 1;
			} else if (Character.isSpace(charArray[i])) {
				space = space + 1;
			} else if (Character.isDigit(charArray[i])) {
				num = num + 1;
			} else {
				specialChar = specialChar + 1;
			}
		}

		// Print the count here
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Special Character: " + specialChar);
	}

}
