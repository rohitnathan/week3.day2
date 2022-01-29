package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class learnset {

	// Hashset needs boolean statement
	// Set does not have get function
	//ctrl+shift+o-- will pull all imports
	//Set is interface 
	//set doesnt maintain the order

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();

		boolean isPresent = names.add("Rohit");
		names.add("R");
		names.add("John");
		boolean isduplicate = names.add("Rohit");

		System.out.println(isPresent);
		System.out.println(isduplicate);

         //can get copied to the List from Set by assigning and we can use the list functions
		
		List<String> list = new ArrayList<String>(names);
		System.out.println(list);
		System.out.println(list.get(0));
		
	}
}
