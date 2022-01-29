package week3.day2;

public class LearnString {
	
	public static void main(String[] args) {
		//String Literal
		//S1 and S2 will get stored in String pool- if value is same
		//S3 will get stored in Heap memory
		// This is for effective memory management
		
	String S1 = "Welcome";
	
	String S2 = "Welcome";
	
	
	String S4 = "welcome";
	char[] ch = new char [7];
	
	
	String S3 = new String ("Welcome");
	
	//validate if both string has same memory
	System.out.println(S1==S2);
	
	//compare the String value
	System.out.println(S1.equals(S3));
	
	// will ignore case sensitive string
	
	System.out.println(S1.equalsIgnoreCase(S4));
	
	// finding length of String
	int length =S1.length();
	System.out.println(length);
	
	//finding the character
	char[] charArray = S4.toCharArray();
    System.out.println(charArray[0]);
	
	
	
	}

}
