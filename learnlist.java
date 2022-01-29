package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class learnlist {

	public static void main(String[] args) {

		// adding angluar brackets is called wrapper class making it a generic eg <string>, <integer>
		List<String> list = new ArrayList<String>();
		List<Integer> list1 = new ArrayList<Integer>();
		// List<boolean> list2 = new ArrayList <boolean>();

		// Add values to List
		list.add("Rohit");
		list.add("R");
		list1.add(2);
		// list1.add(true);

		System.out.println(list);

		// Find size
		int size = list.size();
		System.out.println(size);

		// retrieve a data from index
		String string = list.get(0);
		System.out.println(string);
		
		//remove data from list
		list.remove(size-1);
		System.out.println(list);

		//verify data is present in list
		boolean ispresent = list.contains("Rohit");
		System.out.println(ispresent);
		
		//remove all data from list
		list.clear();
		System.out.println(list);
		
		//confirm if list is empty
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		//collections is a class
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
