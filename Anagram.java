package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		int length1 = text1.length();
		int length2 = text1.length();

		boolean status = true;

		if (length1 == length2) {
			char[] charArray1 = text1.toCharArray();
			Arrays.sort(charArray1);
			System.out.println(charArray1);
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray2);
			System.out.println(charArray2);

			status = Arrays.equals(charArray1, charArray2);

			if (status) {
				System.out.println(text1 + " is an anagram of " + text2);
			} else {
				System.out.println(text1 + " is not an anagram of " + text2);
			}

		} else {
			System.out.println(text1 + " is not an Anagram of " + text2);
		}

	}

}